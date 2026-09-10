package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression;

public class ExampleInt {
  static void main() {
    int max = 1000;
    double radium226HalfLifeYears = 1600.00;
    double radium228HalfLifeYears = 6.70;
    double ageOfUniverse = 13_700_000_000.00;

    var isTrue = max instanceof double;
    var isAlsoTrue = radium226HalfLifeYears instanceof int;
    var isFalse = radium228HalfLifeYears instanceof int;
    var isAlsoFalse = ageOfUniverse instanceof int;

    System.out.println(isTrue);
    System.out.println(isAlsoTrue);
    System.out.println(isFalse);
    System.out.println(isAlsoFalse);
  }

}
