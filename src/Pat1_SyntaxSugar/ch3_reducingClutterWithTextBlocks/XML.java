package Pat1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

import java.util.Map;
import java.util.TreeSet;

public class XML {
  static void main() {
    Map<String, String> authors = Map.of("Java", "Gosling", "Ruby", "Matsumoto", "JavaScript", "Eich");
    Map<String, Integer> years = Map.of("Java", 1995, "Ruby", 1996, "JavaScript", 1995);
    String document = "<languages>\n";

    for (String name: new TreeSet<String >(authors.keySet())){
      document += " <language name=\"" + name + "\">\n" +
              " <author>" + authors.get(name) + "</author>\n" +
              " <year>" + years.get(name) + "</year>\n";
      document += " </language>\n";
    }
    document += " </language>\n";
  }
}
