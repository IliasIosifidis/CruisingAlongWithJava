package part5_CustomFunctionalPipelineSteps.chapter11_ExtendingFunctionalPipelinesWithGatherers;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Gatherer;

public class CustomMap {
  static void main() {
    List.of(1,2,3).stream()
            .gather(redundantMap(e -> e*2))
            .forEach(System.out::println);
  }

  public static Gatherer<Integer, ?, Integer> redundantMap(
          Function<Integer, Integer> mapper){
    return Gatherer.of((_, element, downstream) ->
            downstream.push(mapper.apply(element)));
  }
}
