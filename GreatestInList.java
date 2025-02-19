import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GreatestInList {

  ArrayList<Integer> list = new ArrayList<>();
  Scanner scanner = new Scanner(System.in);
  int greatest = Integer.MIN_VALUE; // Inicializa a lo mínimo que puede guardar una variable Integer en Java. (-2147483648)

  // evitando problemas con números negativos.

  public void greatest() {
    int number = 0;

    while (true) {
      try {
        System.out.println("Enter a number: (Enter -1 to stop)");
        number = scanner.nextInt();

        if (number == -1) {
          System.out.println("Quitting...");
          break;
        }

        list.add(number);

        greatest = list.get(0);
      } catch (InputMismatchException e) {
        System.out.println("Enter a valid number.");
        scanner.nextLine();
      }
    }

    if (list.isEmpty()) {
      System.out.println("No numbers were entered.");
    } else {
      greatestFormula();
    }
  }

  public void greatestFormula() {
    for (int i = 0; i < list.size(); i++) {
      int number = list.get(i);
      if (greatest < number) {
        greatest = number;
      }
    }

    System.out.println("\nThe greatest number: " + greatest);
    searchFor();
  }

  public void searchFor() {
    while (true) {
      System.out.println("\nSearch for: ");
      int search = scanner.nextInt();

      int index = list.indexOf(search);

      if (index == -1) {
        System.out.println("\nNumber not found at list.");
      } else {
        System.out.println("\nIndex is: " + index);
        break;
      }
    }
  }

  public static void main(String[] args) {
    GreatestInList great = new GreatestInList();
    great.greatest();
  }
}
