package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression;

record Tire(double pressure){}

public class TirePressureCheck {
  static void main() {
    System.out.println(checkPressure(new Tire(30.25)));
    System.out.println(checkPressure(new Tire(30.0)));
    System.out.println(checkPressure(new Tire(32.0)));
    System.out.println(checkPressure(new Tire(33.9)));
  }

  public static String checkPressure(Tire tire){
    var recommendation = switch (tire.pressure()){
      case int i when i == 32 -> "tire looks good";
      case double d when d > 32.00 -> "deflate till 32.00";
      case double d -> "i'm tired";
    };
    return tire.pressure() + " PSI, " + recommendation;
  }
}


