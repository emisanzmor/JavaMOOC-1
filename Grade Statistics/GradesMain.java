import java.util.Scanner;

public class GradesMain {

  public static void main(String[] args) {
    Points point = new Points();
    Scanner scanner = new Scanner(System.in);

    GradeStatsUI grades = new GradeStatsUI(scanner, point);

    grades.mainMenu();
  }
}
