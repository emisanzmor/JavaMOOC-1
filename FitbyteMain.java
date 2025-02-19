import java.util.Scanner;

public class FitbyteMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "Enter age and resting heart rate separated by a comma."
    );

    String input = scanner.nextLine();
    String[] ageheart = input.split(",");
    if (ageheart.length != 2) {
      System.out.println(
        "Invalid input. Please enter both age and resting heart rate."
      );
    }
    try {
      int age = Integer.parseInt(ageheart[0].trim());
      int restingHeartRate = Integer.parseInt(ageheart[1].trim());

      Fitbyte fb = new Fitbyte(age, restingHeartRate);

      System.out.println(
        "Age :" +
        fb.getAge() +
        " Target " +
        fb.getPercentage() +
        "% of maximum: " +
        fb.targetHeartRate(restingHeartRate)
      );
    } catch (NumberFormatException e) {
      System.out.println("Enter a valid number.");
    }

    scanner.close();
  }
}
