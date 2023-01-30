package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
class Tag {
    String name;
    Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("<" + name);
        for (Map.Entry<String, String> attr: this.attributes.entrySet()) {
            str.append(" " + attr.getKey() + "=" + "\""+ attr.getValue()+ "\"");
        }
        str.append(">");
        return str.toString();
    }
}
// END
