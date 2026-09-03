package Pat1_SyntaxSugar.usingTypeInference;

import java.util.function.Consumer;

public class GenericsTypeWitness {
  public <T> void process(Consumer<T> consumer){}
  public static void display(int value){}

  static void main() {
    GenericsTypeWitness instance = new GenericsTypeWitness();
//    instance.process(input -> display(input)); // ERROR: incompatible types: Object -> int
    instance.<Integer>process(input -> display(input));
  }
}
