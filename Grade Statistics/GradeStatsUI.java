import java.util.Scanner;

public class GradeStatsUI {

  Points points = new Points();
  Scanner scanner = new Scanner(System.in);
  boolean mainMenu = true;

  public GradeStatsUI(Scanner scanner, Points points) {
    this.points = points;
    this.scanner = scanner;
  }

  public void mainMenu() {
    while (mainMenu) {
      System.out.println("Welcome. Options: ");
      System.out.println("1. Enter grades 2. Average 3. Quit");
      int command = Integer.parseInt(scanner.nextLine());
      optionsMenu(command);
    }
  }

  public void optionsMenu(int command) {
    switch (command) {
      case 1:
        while (true) {
          System.out.println("Enter grade: -1 TO QUIT");
          int grade = Integer.parseInt(scanner.nextLine());
          points.addPointTotals(grade);

          if (grade == -1) {
            System.out.println("QUITTING...");
            break;
          }
        }
        break;
      case 2:
        if (points.average() < 0) {
          System.out.println("Couldn't get average.");
        } else {
          System.out.println("Average: " + points.average());
          System.out.println("Average (passing): " + points.averagePassing());
          System.out.println("Pass percentage: " + points.passPercentage());
          points.gradeDistribution();
        }
        break;
      case 3:
        System.out.println("QUITTING...");
        mainMenu = false;

        break;
    }
  }
}
