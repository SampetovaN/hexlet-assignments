package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class FileKV implements KeyValueStorage {
    private String path;
    private Map<String, String> map;
    private Map<String, String> allData = new HashMap<>();

    public FileKV(String path, Map<String, String> map) {
        this.path = path;
        this.map = new HashMap<>(map);
        this.allData.putAll(this.map);
        write();
    }

    private void write() {
        Utils.writeFile(this.path, this.allData.toString());
    }

    @Override
    public void set(String key, String value) {
        this.allData.put(key, value);
        write();
    }

    @Override
    public void unset(String key) {
        this.allData.remove(key);
        write();
    }

    @Override
    public String get(String key, String defaultValue) {
        var value = this.allData.get(key);
        return (value == null || value.isEmpty()) ? defaultValue : value;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.allData);
    }
}
// END
