package part1_SyntaxSugar.ch2_usingTypeInference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class LocalVariable {

  static void main() {
    HashMap<String, List<Integer>> scores = new HashMap<String, List<Integer>>();
    var scores2 = new HashMap<String, List<Integer>>();
    var numberOfCores  = Runtime.getRuntime().availableProcessors();

    List<String> languages = List.of("C++", "C", "Erlang", "Elm", "Haskell", "Ruby", "Python");
    List<String> jvmLanguages = List.of("Java", "Kotlin", "Scala", "Groovy", "Clojure", "JRuby");

    Map<Integer, List<String>> namesByLength = languages
            .stream()
            .collect(groupingBy(String::length, mapping(String::toUpperCase, toList())));

    Map<Integer, List<String>> jvmNamesByLength = jvmLanguages
            .stream()
            .collect(groupingBy(String::length, mapping(String::toUpperCase, toList())));

    // OR
//    var groupCriteria = groupingBy(String::length, mapping(String::toUpperCase, toList()));
//    var namesByLength2 = languages.stream().collect(groupCriteria);
//    var jvmByLength2 = jvmLanguages.stream().collect(groupCriteria);

    greet();
  }

  public static void greet(){
    var message = "helo there";
    System.out.println(message);
  }

}
