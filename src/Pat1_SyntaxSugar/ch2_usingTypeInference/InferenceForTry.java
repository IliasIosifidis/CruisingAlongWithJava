package Pat1_SyntaxSugar.ch2_usingTypeInference;

import java.util.List;

public class InferenceForTry {
  static void main() {
    var names = List.of("One", "Two", "Three", "Four");

    for (var name : names) {
      System.out.println(name);
    }

    System.out.println();

    for (var i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }
    //    try(var resource = new Resource()){}
  }
}
