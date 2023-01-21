package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
class App {
    static public void swapKeyValue(KeyValueStorage storage) {
        for (Map.Entry<String,String> entry : new HashMap<>(storage.toMap()).entrySet()) {
            storage.unset(entry.getKey());
            storage.set(entry.getValue(), entry.getKey());
        }
    }
}
// END
