import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionProgramMain {

  public static void main(String[] args) {
    int duration;
    Scanner scanner = new Scanner(System.in);
    ArrayList<TelevisionProgram> television = new ArrayList<>();

    while (true) {
      System.out.println("Enter a television program name: ");
      String input = scanner.nextLine();

      if (input.isEmpty()) {
        System.out.println("QUITTING...");
        break;
      }

      System.out.println("Enter it's duration: ");
      duration = Integer.parseInt(scanner.nextLine());

      television.add(new TelevisionProgram(input, duration));
    }

    System.out.println("Programs maximum duration: ");
    duration = Integer.parseInt(scanner.nextLine());

    for (TelevisionProgram tv : television) {
      if (tv.getDuration() <= duration) {
        System.out.println(tv.toString());
      }
    }
    scanner.close();
  }
}
