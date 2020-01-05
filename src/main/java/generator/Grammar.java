package generator;

import generator.subclasses.*;

import java.util.*;

public class Grammar {
    String grammarName;
    String startState;
    Map<String, TokenItem> tokenItems = new HashMap<>();
    Map<String, State> states = new HashMap<>();
    List<TokenItem> tokens = new ArrayList<>();
    List<TokenItem> skipTokens = new ArrayList<>();

    public void setName(String s) {
        grammarName = s;
    }

    public void setStartState(String s) {
        startState = s;
    }

    public void addToken(String tokenName, String pattern) {
        TokenItem item = new TokenItem(tokenName, pattern);
        tokens.add(item);
        if (tokenItems.containsKey(tokenName)) {
            System.err.println("Duplicate token name.");
            System.exit(-1);
        }
        tokenItems.put(tokenName, item);
    }

    public void addSkipToken(String tokenName, String pattern) {
        TokenItem item = new TokenItem(tokenName, pattern);
        skipTokens.add(item);
        if (tokenItems.containsKey(tokenName)) {
            System.err.println("Duplicate token name.");
            System.exit(-1);
        }
        tokenItems.put(tokenName, item);
    }

    public void showTokens() {
        System.out.println(grammarName);
        System.out.println("TOKENS");
        for (TokenItem item : tokens) {
            System.out.printf("Key: %s  Value: %s \n", item.name, item.pattern);
        }
        System.out.println("SKIP TOKENS");
        for (TokenItem item : skipTokens) {
            System.out.printf("Key: %s  Value: %s \n", item.name, item.pattern);
        }
    }

    public void addState(State s) {
        states.put(s.getName(), s);
    }

    void constructFirst() {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (State state : states.values()) {
                for (Rule rule : state.rules) {
                    for (String item : rule.items) {
                        if (item.equals("EPS")) {
                            if (state.addToFirst(item)) {
                                changed = true;
                            }
                        } else if (tokenItems.containsKey(item)) {
                            if (state.addToFirst(item)) {
                                changed = true;
                            }
                            break;
                        } else if (states.containsKey(item)) {
                            State st = states.get(item);
                            for (String newItem : st.getFirst()) {
                                if (state.addToFirst(newItem)) {
                                    changed = true;
                                }
                            }
                            if (!st.hasEpsilon()) {
                                break;
                            }
                        } else {
                            System.err.println("Unknown state name in " + state.getName() + ".");
                            System.exit(-1);
                        }
                    }
                }
            }
        }
    }

    void showFirst() {
        System.out.println("---FIRST---");
        for (State state : states.values()) {
            System.out.println(state.getName() + " : " + state.getFirst().toString());
        }
    }

    void constructFollow() {
        State start = states.get(startState);
        start.addToFollow("_END");
        boolean changed = true;
        while (changed) {
            changed = false;
            for (State state : states.values()) {
                for (Rule rule : state.rules) {
                    Set<String> curGammaFirst = new HashSet<>();
                    curGammaFirst.add("_END");
                    for (int i = rule.items.size() - 1; i >= 0; --i) {
                        String item = rule.items.get(i);
                        if (item.equals("EPS")) {
                            curGammaFirst.add("EPS");
                            continue;
                        }
                        if (tokenItems.containsKey(item)) {
                            curGammaFirst.clear();
                            curGammaFirst.add(item);
                            continue;
                        }
                        if (states.containsKey(item)) {
                            State st = states.get(item);
                            for (String s : curGammaFirst) {
                                if (!s.equals("EPS")) {
                                    if (st.addToFollow(s)) {
                                        changed = true;
                                    }
                                }
                            }
                            if (curGammaFirst.contains("_END")) {
                                for (String s : state.getFollow()) {
                                    if (st.addToFollow(s)) {
                                        changed = true;
                                    }
                                }
                            }
                            if (!st.hasEpsilon()) {
                              curGammaFirst.clear();
                            }
                            curGammaFirst.addAll(st.getFirst());
                        } else {
                            System.err.println("Unknown state name " + item + " in " + state.getName() + ".");
                            System.exit(-1);
                        }
                    }
                }
            }
        }
    }

    void showFollow() {
        System.out.println("---FOLLOW---");
        for (State state : states.values()) {
            System.out.println(state.getName() + " : " + state.getFollow().toString());
        }
    }

    HashSet<String> firstForRule(Rule r) {
        HashSet<String> first = new HashSet<>();
        for (String item : r.items) {
            if (item.equals("EPS")) {
                first.add("EPS");
            } else if (tokenItems.containsKey(item)) {
                first.add(item);
                break;
            } else if (states.containsKey(item)) {
                first.addAll(states.get(item).getFirst());
                if (!first.contains("EPS")) {
                    break;
                }
            }
        }
        return first;
    }
}
