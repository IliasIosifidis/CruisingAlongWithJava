package part1_SyntaxSugar.ch2_usingTypeInference;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Lambdas {
  static void main() {
    List<Integer> numbers = List.of(1,2,3,4,5);
    numbers.forEach((Integer number) -> System.out.println(number * 2)); // no need for Integer
    numbers.forEach(number -> System.out.println(number * 2));
//    numbers.forEach((@NotNull number) -> System.out.println(number * 2));// ERROR
    numbers.forEach((@NotNull var number) -> System.out.println(number * 2));// ERROR
  }
}
