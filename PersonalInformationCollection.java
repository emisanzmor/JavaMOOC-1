import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class PersonalInformationCollection {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
    String firstName;
    String lastName = "";

    while (true) {
      System.out.println("Enter first name: ");
      firstName = scanner.nextLine();

      if (firstName.isEmpty()) {
        System.out.println("QUITTING...");
        break;
      }

      System.out.println("Enter last name: ");
      lastName = scanner.nextLine();

      System.out.println("Enter ID number: ");
      String identificationNumber = scanner.nextLine();

      PersonalInformation personal = new PersonalInformation(
        firstName,
        lastName,
        identificationNumber
      );

      infoCollection.add(personal);
    }
    for (PersonalInformation personal : infoCollection) {
      System.out.println(
        personal.getFirstName() + " " + personal.getLastName()
      );
    }
    scanner.close();
  }
}
