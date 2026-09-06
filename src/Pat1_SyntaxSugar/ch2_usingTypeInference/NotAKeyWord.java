package Pat1_SyntaxSugar.ch2_usingTypeInference;

import java.util.List;

public class NotAKeyWord {
  static void main() {
    var PI = Math.PI;
    String var = "please don't"; //Possible but not a good idea
//    var var = "please don't"; // also possible, but avoid it
    System.out.println(var);

    // Target intersection types
    var numbers = List.of(1,2.,3L);
//    numbers.add("hello"); // ERROR

    class Book{
//      var name = ""; //ERROR
    }

    class Battery {
      private int power;
//      public var charge( var toPower) { //ERROR
//        power = toPower;
//      }
    }
  }
}
