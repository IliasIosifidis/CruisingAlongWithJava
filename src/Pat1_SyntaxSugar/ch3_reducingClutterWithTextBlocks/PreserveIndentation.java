package Pat1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

public class PreserveIndentation {
  public static String preserveIndentation(){
    String message = """
    If you like
    you can ask the indentations
    to be preserved, unaltered, like in this example.
  """;
    return message;
  }

  static void main() {
    System.out.println("--------");
    System.out.print(preserveIndentation());
    System.out.println("--------");
  }
}
