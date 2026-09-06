package Pat1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

import java.util.Map;

import static java.util.stream.Collectors.joining;

public class XMLConcise {
  static void main() {
    Map<String, String> authors = Map.of("Java", "Gosling", "Ruby", "Matsumoto", "JavaScript", "Eich");
    Map<String, Integer> years = Map.of("Java", 1995, "Ruby", 1996, "JavaScript", 1995);
    var language = """
            <language name="%s">
              <author>%s</author>
              <year>%d</year>
            </language>
            """.indent(2);
    var childElements = authors.keySet()
            .stream()
            .sorted()
            .map(name -> language.formatted(name, authors.get(name), years.get(name)))
            .collect(joining(""));
    String xmlFormated = """
            <languages>
            %s\
            </languages>
            """.formatted(childElements);
    System.out.println(xmlFormated);
  }
}
