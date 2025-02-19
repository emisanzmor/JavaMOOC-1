import java.util.Scanner;

public class StatisticsMain {

  public static void main(String[] args) {
    Statistics stats = new Statistics();
    Statistics even = new Statistics();
    Statistics odd = new Statistics();
    Scanner scanner = new Scanner(System.in);
    int input;

    /* for (int i = 0; i < 3; i++) {
      System.out.println("Give me three numbers: ");
      stats.addNumber(Integer.parseInt(scanner.nextLine()));
    } */

    System.out.println("Enter numbers: ");

    while (true) {
      input = Integer.parseInt(scanner.nextLine());

      if (input == -1) {
        System.out.println("Quitting...");
        break;
      }

      stats.addNumber(input);

      if (input % 2 == 0) {
        even.addNumber(input);
      } else {
        odd.addNumber(input);
      }
    }

    System.out.println("Number of elements: " + stats.getCount());
    System.out.println("Sum is: " + stats.sum());
    System.out.println("Average is: " + stats.average());
    System.out.println("Sum of even numbers: " + even.sum());
    System.out.println("Sum of odd numbers: " + odd.sum());

    scanner.close();
  }
}
