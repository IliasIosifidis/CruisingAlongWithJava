package part1_SyntaxSugar.ch2_usingTypeInference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MindTheInference {
  static void main() {
    List<Integer> values = new ArrayList<>();
    values.add(1);
//    values.add("hi") // ERROR

    var values2 = new ArrayList<>();
    values2.add(1);
    values2.add("hi"); // Not an ERROR

    List<Integer> numbers = new ArrayList<>();

    Collection<Integer> numbers2 = new ArrayList<Integer>(List.of(1,2,3));
    System.out.println(numbers2);
    numbers2.remove(1); // removes the element
    System.out.println(numbers2);

    var numbers3 = new ArrayList<Integer>(List.of(1,2,3));
    System.out.println(numbers3);
    numbers3.remove(1); // removes the index
    System.out.println(numbers3);

    Runnable runnable = () -> System.out.println("you called...");
    runnable.run();

//    var runnable2 = () -> System.out.println("error?");  // ERROR
  }
}
