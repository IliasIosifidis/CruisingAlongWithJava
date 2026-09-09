package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression;

public class CheckBlank {

  public void process(CharSequence data){
    if (data instanceof String){
      System.out.println("the data is blank?: " + ((String) data).isBlank());
    }
  }

  public String stringNotEmpty(CharSequence data){
    return data instanceof String string && !string.isBlank() ? "yep" : "nope";
  }
}
