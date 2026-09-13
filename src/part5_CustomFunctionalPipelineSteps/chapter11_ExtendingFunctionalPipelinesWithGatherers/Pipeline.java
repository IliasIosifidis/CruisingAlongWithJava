package part5_CustomFunctionalPipelineSteps.chapter11_ExtendingFunctionalPipelinesWithGatherers;

import java.util.List;

public class Pipeline {
  static void main() {
    var result = List.of(1,2,5,4,3,6).stream()
            .takeWhile(e -> e != 3)
            .filter(e -> e % 2 == 0)
            .mapToInt(e -> e * 2)
            .sum();
    System.out.println(result);
  }
}
