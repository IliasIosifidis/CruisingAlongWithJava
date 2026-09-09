package part3_FluentExpressions.chapter6_SwitchingToSwitchExpression;

import java.util.List;

public class Grade {
  static void main() {
    List.of(59, 64, 76, 82, 89, 94, 100)
            .stream()
            .map(Grade::gradeFor)
            .forEach(System.out::println);
  }

  private static String gradeForIfs(int score) {
    String letterGrade = "";
    if(score >= 90) {
      letterGrade = "A";
    } else if(score >= 80) {
      letterGrade = "B";
    } else if(score >= 70) {
      letterGrade = "C";
    } else if(score >= 60) {
      letterGrade = "D";
    } else {
      letterGrade = "F";
    }
    return "Grade for score " + score + " is " + letterGrade;
  }

  private static String gradeForSwitch(int score) {
    String letterGrade = "";
    switch (Math.min(score / 10, 10)){
      case 10:
        letterGrade = "A";
        break;
      case 9:
        letterGrade = "A";
        break;
      case 8:
        letterGrade = "B";
        break;
      case 7:
        letterGrade = "C";
        break;
      case 6:
        letterGrade = "D";
        break;
      default:
        letterGrade = "F";
        break;
    }
    return "Grade for score " + score + " is " + letterGrade;
  }

  private static String gradeFor(int score){
    final String letterGrade = switch (Math.min(score/10,10)){
      case 10, 9 -> "A";
      case 8 -> "B";
      case 7 -> "C";
      case 6 -> "D";
      default -> "F";
    };
    return "Grade for score " + score + " is " + letterGrade;
  }
}
