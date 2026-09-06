package Pat1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

public class SpecialEscapes {
  public static String specialEscapes(){
    var message = """
            This line has 3 spaces in the end
            This one has 2 but is preserved  \s
            This line is appended \
            with the next
              This is intentionally indented.
            """;
    return message;
  }

  static void main() {
    System.out.println(specialEscapes().replaceAll(" ","~"));
  }
}
