package part1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

public class IndentationError {
  static void main() {
    var message = """
The compiler can keep an eye
  on lines like this with
indentation errors""";
    System.out.println(message);
  }

}
