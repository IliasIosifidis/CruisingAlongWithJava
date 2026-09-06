package Pat1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

public class Escapes {
  static String weather = """
          The 'National Weather Service' has issued a "severe" thunderstorm warning
          for tomorrow. Please \"""stock up\""" on the essentials you'll need during
          the adverse weather.
          
          \\\\Approved for general distribution\\\\""\"
          """;

  static void main() {
    System.out.println(weather);
  }
}
