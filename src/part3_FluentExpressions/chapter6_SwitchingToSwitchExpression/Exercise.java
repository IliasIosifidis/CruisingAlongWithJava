package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression;

public class Exercise {
  static void main() {
    try {
      for (var subClasses : TimeOfDay.class.getPermittedSubclasses()){
        var instance = (TimeOfDay) subClasses.getDeclaredConstructor().newInstance();
        System.out.println(ProcessTimeOfDay.greet(instance));
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

