package part1_SyntaxSugar.ch3_reducingClutterWithTextBlocks;

public class CreateMessage {
  public static String createMessage() {
    String message = "Thank you for your purchase."
     + " We hope you had a pleasant experience.\n\n"
     + "We request that you take a few minutes "
     + "to provide your feedback.\n\n"
     + "Please fill out the survey at https://survey.example.com\n\n"
     + "If you have any questions or comments, "
     + "please click on the \"Support\" link\n"
     + "at https://www.example.com.\n";
    return message;
  }

  static void main() {
    System.out.println(createMessage());
  }
}
