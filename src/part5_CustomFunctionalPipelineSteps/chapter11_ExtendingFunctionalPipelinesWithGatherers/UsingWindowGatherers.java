package part5_CustomFunctionalPipelineSteps.chapter11_ExtendingFunctionalPipelinesWithGatherers;

import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class UsingWindowGatherers {
  static void main() {
    Stream.of(1,2,3,4,5,6)
            .gather(Gatherers.windowFixed(3))
            .forEach(System.out::println);
    System.out.println("------------");
    Stream.of(1,2,3,4,5,6)
            .gather(Gatherers.windowSliding(3))
            .forEach(System.out::println);
  }
}
