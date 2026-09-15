package part5_CustomFunctionalPipelineSteps.chapter11_ExtendingFunctionalPipelinesWithGatherers;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Gatherer;

public class UsingGatherers {
  static void main() {
    usePeakInOrder();
    useMapWithIndex();
  }



  private static <T> boolean consumeAndPush(T element, Consumer<T> consumer, Gatherer.Downstream<? super T> downstream) {
    consumer.accept(element);
    return downstream.push(element);
  }

  public static <T> Gatherer<T, ?, T> peakInOrder(Consumer<T> consumer) {
    return Gatherer.ofSequential((_, element, downstream) ->
            consumeAndPush(element, consumer, downstream));
  }

  public static void usePeakInOrder() {
    var numbers = List.of(10, 11, 15, 12);
    numbers.parallelStream()
            .peek(System.out::println)
            .reduce(0, Integer::sum);
    System.out.println("----------");
    numbers.parallelStream()
            .gather(peakInOrder(System.out::println))
            .reduce(0, Integer::sum);
  }

  //  ----------------------------------
  public record ValueWithIndex<E>(E value, int index) {
    @Override
    public String toString(){
      return index + ": " + value;
    }
  }

  static class Index{
    private int position = 0;

    public int getAndIncrement(){
      return position++;
    }
  }

  public static <T, R> Gatherer<? super T, Index, ValueWithIndex<R>>
  mapWithIndex(Function<T, R> mapper){
    return Gatherer.ofSequential(Index::new, (index, element, downstream) ->
            downstream.push(new ValueWithIndex<>(

                    mapper.apply(element), index.getAndIncrement())));
  }
  private static void useMapWithIndex() {
    List.of("Tom", "Jerry", "Tyke")
            .parallelStream()
            .filter(name -> name.length() >3)
            .gather(UsingGatherers.<String,String>mapWithIndex(String::toUpperCase))
            .forEachOrdered(System.out::println);
  }
}
