package part5_CustomFunctionalPipelineSteps.chapter11_ExtendingFunctionalPipelinesWithGatherers;

import java.util.List;
import java.util.stream.Gatherers;

public class Fold {
  static void main() {
    var result = List.of(1,2,3,4,5,6).stream()
            .filter(e -> e %2 == 0)
            .reduce(0, Integer::sum);

    var tenTimesResult = result * 10;
    System.out.println(tenTimesResult);

    List.of(1,2,3,4,5,6).stream()
            .filter(e -> e % 2 == 0)
            .gather(Gatherers.fold(() -> 0, Integer::sum))
            .map(e -> e * 10)
            .forEach(System.out::println);
  }
}
