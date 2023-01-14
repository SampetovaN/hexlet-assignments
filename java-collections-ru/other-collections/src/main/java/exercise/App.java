package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class App {
    static public LinkedHashMap<String, String> genDiff (Map<String, Object> map1, Map<String, Object> map2) {
        TreeSet<String> set = new TreeSet<>();
        for (String key : map1.keySet()) {
            if(map1.get(key) != null && map2.get(key) == null) {
                set.add(key + "=deleted");
            }
            else if (!map1.get(key).equals(map2.get(key))) {
                set.add(key + "=changed");
            }

            else if(map1.get(key).equals(map2.get(key))) {
                set.add(key + "=unchanged");
            }
        }
        for (String key: map2.keySet()) {
            if(map2.get(key) != null && map1.get(key) == null) {
                set.add(key + "=added");
            }
        }


      return set.stream()
              .collect(Collectors.toMap(
                      k -> k.split("=")[0],
                      v -> v.split("=")[1],
                      (o1, o2) -> o2, LinkedHashMap::new));
    }
}
//END
