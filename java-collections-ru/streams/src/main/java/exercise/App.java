package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static long getCountOfFreeEmails (List<String> list) {
         return list.stream()
                 .filter(x -> x.endsWith("gmail.com") || x.endsWith("yandex.ru") || x.endsWith("hotmail.com"))
                 .count();
    }
}
// END
