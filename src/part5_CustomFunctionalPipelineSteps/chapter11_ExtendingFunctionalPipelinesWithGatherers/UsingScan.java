package part5_CustomFunctionalPipelineSteps.chapter11_ExtendingFunctionalPipelinesWithGatherers;

import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class UsingScan {
  static void main() {
    Stream.of(1,2,3,4,5,6)
            .filter(e -> e % 2 == 0)
            .gather(Gatherers.scan(() -> 0, Integer::sum))
            .forEach(System.out::println);
  }
}
