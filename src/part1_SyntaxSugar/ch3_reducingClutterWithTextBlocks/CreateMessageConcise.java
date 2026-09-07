package part1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

public class CreateMessageConcise {
  public static String createMessage() {
    var message = """
Thank you for your purchase. We hope you had a pleasant experience.

We request that you take a few minutes to provide your feedback.

Please fill out the survey at https://survey.example.com

If you have any questions or comments, please click on the "Support"link

at https://www.example.com.
""";
    return message;
  }

  static void main() {
    System.out.println(createMessage());
  }
}
