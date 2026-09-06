package Pat1_SyntaxSugar.ch2_usingTypeInference;

import java.util.List;

import static java.util.Comparator.*;

public class TypeInferenceFail {
  static void main() {
    List<String> languages = List.of("Java", "Kotlin", "Scala", "Groovy", "Clojure", "JRuby");
    languages.stream()
            .sorted(comparing(name -> name.length()))
            .forEach(System.out::println);

    // Type needs to be defined
    languages.stream()
            .sorted(comparing((String name) -> name.length())
                    .reversed());

    // method reference for simplicity
    languages.stream()
            .sorted(comparing(String::length)
                    .reversed());
  }
}
