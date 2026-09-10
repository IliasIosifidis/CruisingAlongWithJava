package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression.sealed;

import org.jetbrains.annotations.NotNull;
import part3_FluentExpressions.chapter6_SwitchingToSwitchExpression.Trade;

public final record BuySealed(String ticker, int quantity) implements TradeSealed, Trade {
  @Override
  public boolean equals(Object obj) {
    return false;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public @NotNull String toString() {
    return "";
  }
}
