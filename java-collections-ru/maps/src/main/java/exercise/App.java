package exercise;

import java.util.HashMap;
import java.util.Map;


// BEGIN
class App {

    public static void main(String[] args) {
        System.out.println(toString(getWordCount("word text cat apple word map apple word")));
    }
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap ();
        if(sentence.isEmpty()) {
            return map;
        }
        String[] arr = sentence.split(" ");

        for(var w: arr) {
            map.put(w, map.get(w) != null ? map.get(w) + 1 : 1);
        }
        return map;
    }

    public static String toString(Map<String, Integer>  map) {
        StringBuilder str = new StringBuilder();
        str.append("{");
        if(map.size() > 0) {
            str.append("\n");
            for (Map.Entry<String, Integer> wordCount: map.entrySet()) {
                str.append("  " + wordCount.getKey() + ": " + wordCount.getValue() + "\n");
            }

        }
         str.append("}");
         return str.toString();
    }
}
//END
