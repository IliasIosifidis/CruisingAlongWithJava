package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression;

public class ProcessTrade {

  public static boolean performPurchase(String ticker, int quantity) {
    System.out.println("Performing purchase for " + ticker);
    return true;
  }

  public static boolean performSell(String ticker, int quantity) {
    System.out.println("Performing sell for " + ticker);
    return true;
  }

  public static boolean processTrade(Trade trade) {
    return switch (trade) {
      case Buy buy when buy.quantity() > 5000 -> {
        generateAuditEvent(buy);
        yield performPurchase(buy.ticker(), buy.quantity());
      }
      case Buy buy -> performPurchase(buy.ticker(), buy.quantity());
      case Sell sell when sell.quantity() > 500 && sell.ticker().equals("TSLA") -> {
        generateAuditEvent(sell);
        yield performSell(sell.ticker(), sell.quantity());
      }
      case Sell sell -> performSell(sell.ticker(), sell.quantity());
      case null -> {
        System.out.println("null is a smell");
        throw new TradingException("trade was null!!!");
      }
      default -> throw new TradingException("invalid trade");
    };
  }

  private static void generateAuditEvent(Trade trade) {
    System.out.println("Generate audit event for " + trade);
  }

  static void main() {
    System.out.println(processTrade(new Buy("GOOG", 1000)));
    System.out.println(processTrade(new Sell("TSLA", 500)));
    System.out.println(processTrade(new Buy("AAPL", 1000)));
    System.out.println(processTrade(new Buy("AMZN", 2000)));
    System.out.println(processTrade(new Sell("TSLA", 600)));
    System.out.println(processTrade(new Buy("AMZN", 6000)));
    try {
      System.out.println(processTrade(null));
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
