package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
   public static boolean scrabble (String str, String realWord) {
       List<String> list = new ArrayList ();
       String[] listWorld = realWord.toLowerCase().split("");
       list.addAll(Arrays.asList(str.toLowerCase().split("")));
       for(var ch: listWorld) {
          if(list.contains(ch)) {
             list.remove(ch);
          }
          else {
              return false;
          }
       }

       return true;
   }
}
//END
