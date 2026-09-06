package Pat1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

import java.util.Map;
import java.util.TreeSet;

import static java.util.stream.Collectors.joining;

public class JSON {
  static void main() {
    Map<String, String> authors = Map.of("Java", "Gosling", "Ruby", "Matsumoto", "JavaScript", "Eich");
    Map<String, Integer> years = Map.of("Java", 1995, "Ruby", 1996, "JavaScript", 1995);

    var document = "{\n" +
            " \"languages\": [\n";
    boolean first = true;

    for (var name : new TreeSet<String>(authors.keySet())) {
      if (!first) {
        document += ",\n";
      }
      first = false;
      document += " {\n \"language\": {\n" +
              " \"name\": \"" + name + "\",\n" +
              " \"author\": \"" + authors.get(name) + "\",\n" +
              " \"year\": " + years.get(name) + "\n" +
              " }\n }";

    }
    document += "\n ]\n}";

    var language = """
        {
          "language":{
            "name": "%s",
            "author": "%s",
            "year": %d
          }
        }""".indent(4);

    var childElements = authors.keySet()
            .stream()
            .sorted()
            .map(name -> language.formatted(name, authors.get(name), years.get(name)))
            .map(String::stripTrailing)
            .collect(joining("," + System.lineSeparator()));

    var formattedString = """
            {
              "languages":[
            %s
              ]
            }""".formatted(childElements);

    System.out.println(formattedString);
  }
}
