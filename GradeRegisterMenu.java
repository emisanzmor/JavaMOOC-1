import java.util.Scanner;

public class GradeRegisterMenu {

  GradeRegister grade = new GradeRegister();
  Scanner scanner;
  boolean menu = true;
  String points;
  int pointsInt;

  public GradeRegisterMenu(Scanner scanner, GradeRegister grade) {
    this.scanner = scanner;
    this.grade = grade;
  }

  public void getUserInput() {
    System.out.println("Points: (Enter -1 to QUIT)");
    points = scanner.nextLine();
    try {
      if (!points.isEmpty()) {
        pointsInt = Integer.parseInt(points);
        processGrades();
      }
    } catch (NumberFormatException e) {
      System.out.println("Enter a valid number.");
      pointsInt = -1;
    }
  }

  public void processGrades() {
    if (pointsInt > 0) {
      grade.addGradeBasedOnPoints(pointsInt);
    } else if (pointsInt == -1) {
      System.out.println("Quitting...");
      menu = false;
    } else {
      System.out.println("Points should be above 0");
    }
  }

  public void menu() {
    while (menu) {
      getUserInput();
    }

    if (pointsInt > 0) {
      System.out.println("Average: " + grade.averageOfGrades());
    }
  }
}
