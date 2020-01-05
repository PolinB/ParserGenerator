grammar GrammarForGenerate;

@header {
import generator.Grammar;
import generator.subclasses.*;
}

start returns [Grammar g]
@init {
    $g = new Grammar();
}: program[$g] EOF;

program[Grammar g]: header[$g] tokens[$g] startState[$g] states[$g];

header[Grammar g]: 'grammar' NAME ';' {
    $g.setName($NAME.text);
};

tokens[Grammar g]: '@tokens' '{' token_line[$g]* '}';

token_line[Grammar g] locals [boolean hasSkip]
@init {
    $hasSkip = false;
}: NAME ':' REGEX (skip_attr {$hasSkip = true;})? ';' {
    if ($hasSkip) {
        $g.addSkipToken($NAME.text, $REGEX.text);
    } else {
        $g.addToken($NAME.text, $REGEX.text);
    }
};

startState[Grammar g]: '@start' '=' NAME ';' {
    $g.setStartState($NAME.text);
};

skip_attr : '->' 'skip';

states[Grammar g]: '@states' '{' (state_line {$g.addState($state_line.state);})+ '}';

state_line returns [State state]
@init {
    $state = new State();
}: NAME {$state.setName($NAME.text);} ':' r1=rule_line {$state.addRule($r1.r);} ('|' r2=rule_line {$state.addRule($r2.r);})* ';';

rule_line returns [Rule r]
@init {
    $r = new Rule();
}: (NAME {$r.addItem($NAME.text);})+;

NAME : [a-zA-Z][a-zA-Z0-9_]*;
REGEX : '"' (~('"'))* '"';
WS: [ \t\n]+ -> skip;