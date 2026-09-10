package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression.sealed;

import part3_FluentExpressions.chapter6_SwitchingToSwitchExpression.Trade;

public class ProcessTradeSealed {

  public static boolean performPurchaseSealed(String ticker, int quantity) {
    System.out.println("Performing purchase for " + ticker);
    return true;
  }

  public static boolean performSellSealed(String ticker, int quantity) {
    System.out.println("Performing sell for " + ticker);
    return true;
  }

  public static boolean processTradeSealed(Trade trade) {
    return switch (trade) {
      case BuySealed buy -> performPurchaseSealed(buy.ticker(), buy.quantity());
      case SellSealed sell -> performSellSealed(sell.ticker(), sell.quantity());
      default -> throw new IllegalStateException("Unexpected value: " + trade);
    };
  }

  static void main() {
    System.out.println(processTradeSealed(new BuySealed("GOOG", 1000)));
    System.out.println(processTradeSealed(new SellSealed("TSLA", 500)));
    System.out.println(processTradeSealed(new BuySealed("AAPL", 1000)));
    System.out.println(processTradeSealed(new BuySealed("AMZN", 2000)));
    System.out.println(processTradeSealed(new SellSealed("TSLA", 600)));
    System.out.println(processTradeSealed(new BuySealed("AMZN", 6000)));
  }
}
