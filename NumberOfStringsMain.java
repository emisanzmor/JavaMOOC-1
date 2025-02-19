import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStringsMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<NumberofStrings> number = new ArrayList<>();

    while (true) {
      System.out.println("Enter some strings: ");
      String input = scanner.nextLine();

      if (input.equals("end")) {
        System.out.println("QUITTING...");
        break;
      } else {
        number.add(new NumberofStrings(input));
      }
    }

    System.out.println("You entered these strings: ");
    for (NumberofStrings n : number) {
      System.out.println(n.getText());
    }

    System.out.println("You entered: " + number.size() + " strings.");
    scanner.close();
  }
}
