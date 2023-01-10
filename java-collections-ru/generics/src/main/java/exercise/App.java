package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> foundBooks = new ArrayList<>();
        for(Map<String, String> book: books) {
            var count = 0;
            for (Map.Entry<String, String> entry : book.entrySet()) {
                if(where.get(entry.getKey()) != null && where.get(entry.getKey()).equals(entry.getValue())) {
                    ++count;
                }
            }
            if(count == where.size()) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }
}
//END
