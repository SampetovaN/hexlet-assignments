package exercise;

import java.util.List;
import java.util.Map;

// BEGIN
class PairedTag  extends  Tag {
    private String text;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String text, List<Tag> children) {
        super(name, attributes);
        this.text = text;
        this.children = children;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(super.toString());
        str.append(text);
        this.children.stream().forEach((child) -> str.append(child.toString()));
        str.append("</" + name + ">");
        return str.toString();
    }
}
// END
