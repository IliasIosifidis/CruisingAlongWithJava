package part1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

public class SmartIndentation {
  public static String smartIndentation(){
    var message = """
            It is great
              when compilers care about conventions
              Make our lives easier""";
    return message;
  }

  static void main() {
    System.out.println("---------");
    System.out.print(smartIndentation());
    System.out.println("---------");
  }
}
