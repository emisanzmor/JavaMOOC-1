import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

  Scanner scanner = new Scanner(System.in);
  String[] nameage = new String[5];
  int oldestage = 0;

  public void NameAge() {
    while (true) {
      System.out.println(
        "Enter a person's name and their age separated by a comma: "
      );
      String input = scanner.nextLine();

      if (input.isEmpty()) {
        break;
      }

      nameage = input.split(",");
      String name = nameage[0];
      int age = Integer.parseInt(nameage[1]);

      if (age > oldestage) {
        oldestage = age;
      }
    }

    System.out.println("Oldest age is: " + oldestage);
  }

  public static void main(String[] args) {
    NameOfTheOldest name = new NameOfTheOldest();
    name.NameAge();
  }
}
