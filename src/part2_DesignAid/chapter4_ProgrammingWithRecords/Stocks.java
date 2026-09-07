package part2_DesignAid.chapter4_ProgrammingWithRecords;

import java.util.List;

public class Stocks {
  public static int simulatePrice(String ticker){
    return 200 + ticker.chars().sum();
  }

  static void main() {
    var tickers = List.of("GOOG", "MSFT", "AMZN", "ORCL", "INTC");
    printPricesOver500(tickers);
  }

  private static void printPricesOver500(List<String> tickers) {
    record Stock(String ticker, int price){
      @Override
      public String toString(){
        return String.format("Ticker: %s Price: $%d", ticker, price);
      }
    }

    tickers.stream()
            .map(ticker -> new Stock(ticker, simulatePrice(ticker)))
            .filter(stock -> stock.price() > 500)
            .forEach(System.out::println);
  }
}
