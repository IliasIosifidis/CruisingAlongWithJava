package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression;

public class ProcessTimeOfDay{
  public static String greet(TimeOfDay timeOfDay){
    return switch (timeOfDay){
      case Day day -> "good day";
      case Night night -> "good night";
      case Dawn dawn -> "good afternoon";
    };
  }
}
