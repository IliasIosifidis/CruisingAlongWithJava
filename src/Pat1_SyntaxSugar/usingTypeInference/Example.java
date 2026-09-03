package Pat1_SyntaxSugar.usingTypeInference;

import java.util.Collections;
import java.util.List;

public class Example {
  List<String > justOne = Collections.singletonList("howdy");
  List<String > nothingHere = Collections.emptyList();
  List<Integer> nothingHereToo = Collections.<Integer>emptyList(); // Redundant Type Witness
}
