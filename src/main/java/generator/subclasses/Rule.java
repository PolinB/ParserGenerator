package generator.subclasses;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    public List<String> items = new ArrayList<>();

    public void addItem(String s) {
        items.add(s);
    }
}
