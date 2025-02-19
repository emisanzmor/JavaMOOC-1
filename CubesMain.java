import java.util.Scanner;

public class CubesMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Enter a number to get it's cube: ");
      String input = scanner.nextLine();

      if (input.equals("end")) {
        System.out.println("QUITTING...");
        break;
      } else {
        double number = Double.parseDouble(input);
        Cubes cubes = new Cubes(number);
        System.out.println("It's cube is: " + cubes.getCube());
      }
    }

    scanner.close();
  }
}
