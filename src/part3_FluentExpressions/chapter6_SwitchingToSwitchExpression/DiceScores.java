package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DiceScores {
  static void main() {
    var rolls = List.of(3, 5, 3, 4, 6, 1);
    var totalScore = rolls
            .stream()
            .mapToInt(DiceScores::scoreForAPip)
            .sum();
    var result = "Total score after rolling dice " + rolls.size() + " times is " + totalScore;
    System.out.println(result);
  }

  private static int scoreForAPip(int pip) {
    Logger logger = Logger.getAnonymousLogger();
    return switch (pip) {
      case 1 -> {
        logger.log(Level.WARNING, "high score observed");
        yield 100;
      }
      case 2 -> 2;
      case 3, 4 -> 3;
      case 5 -> 5;
      case 6 -> 50;
      default -> {
        logger.log(Level.SEVERE, "invalid roll of dice: " + pip);
        yield 0;
      }
    };
  }

  private static int scoreForAPipEnum(Pip pip) {
    Logger logger = Logger.getAnonymousLogger();
    return switch (pip) {
      case ONE -> {
        logger.log(Level.WARNING, "high score observed");
        yield 100;
      }
      case TWO -> 2;
      case THREE, FOUR -> 3;
      case FIVE -> 5;
      case SIX -> 50;
    };
  }
}
