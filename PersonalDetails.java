import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

  Scanner scanner = new Scanner(System.in);
  ArrayList<Integer> years = new ArrayList<>();
  ArrayList<String> names = new ArrayList<>();
  String largestName = "";

  public void NamesBirth() {
    while (true) {
      System.out.println(
        "Enter name and birth year separated by a comma: (Press ENTER to stop)"
      );

      String input = scanner.nextLine();

      if (input.isEmpty()) {
        break;
      }

      String[] namesbirth = input.split(",");
      String name = namesbirth[0];
      names.add(name);
      String year = namesbirth[1];

      if (year.length() == 4) {
        {
          int birthYear = Integer.parseInt(year);
          years.add(birthYear);
        }
      }

      if (name.length() > largestName.length()) {
        largestName = name;
      }
    }

    if (years.size() > 0) {
      int total = 0;

      for (int index : years) {
        total += index;
      }

      double averageYears = total / (double) years.size();
      System.out.println("Average birth year is: " + averageYears);
    }

    System.out.println("Largest name is: " + largestName);
  }

  public static void main(String[] args) {
    PersonalDetails personal = new PersonalDetails();
    personal.NamesBirth();
  }
}
