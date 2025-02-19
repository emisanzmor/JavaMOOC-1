import java.util.Scanner;

public class NameOfTheOldest2 {

  Scanner scanner = new Scanner(System.in);
  int oldestage = 0;
  String oldestname;

  public void NamesAges() {
    while (true) {
      System.out.println("Enter name and age separated by a comma: ");
      String input = scanner.nextLine();

      if (input.isEmpty()) {
        break;
      }

      String[] nameage = input.split(",");
      String name = nameage[0].trim();
      int age = Integer.parseInt(nameage[1].trim());

      if (age > oldestage) {
        oldestage = age;
        oldestname = name;
      }
    }

    System.out.println("Oldest age is " + oldestage + " from " + oldestname);
  }

  public static void main(String[] args) {
    NameOfTheOldest2 name = new NameOfTheOldest2();
    name.NamesAges();
  }
}
