package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    static public String[][] enlargeArrayImage(String[][] arr) {
        List<List<String>> result = new ArrayList<>();
        List.of(arr).stream()
                .map(x -> List.of(x))
                .forEach(x -> {
                    List<String> test = new ArrayList<>();
                    for(String str: x) {
                        test.add(str);
                        test.add(str);
                    }
                    result.add(test);
                    result.add(test);
                });

        System.out.println(result);

        return result.stream()
                .map(x -> x.toArray(String[]::new))
                .toArray(String[][]::new);
    }
}
// END
