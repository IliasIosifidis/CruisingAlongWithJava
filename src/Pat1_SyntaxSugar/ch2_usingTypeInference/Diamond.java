package Pat1_SyntaxSugar.ch2_usingTypeInference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diamond {
  Map<String, List<Integer>> scores = new HashMap<String, List<Integer>>(); // old
  Map<String, List<Integer>> scores2 = new HashMap<>(); // new
  // inner class
  Map<String, List<Integer>> scores3 = new HashMap<>(){

  };
}
