import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumbersFromAFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> lines = new ArrayList<>();

    System.out.println("File name: ");
    String fileName = scanner.nextLine();

    try (Scanner file = new Scanner(Paths.get(fileName))) {
      while (file.hasNextLine()) {
        String line = file.nextLine();

        try {
          lines.add(Integer.parseInt(line));
        } catch (NumberFormatException e) {
          System.out.println("Couldn't parse line as number: " + line);
        }
      }

      System.out.println("Enter lower bound: ");
      int lowerBound = Integer.parseInt(scanner.nextLine());
      System.out.println("Enter upper bound: ");
      int upperBound = Integer.parseInt(scanner.nextLine());

      if (lowerBound >= upperBound) {
        System.out.println(
          "Invalid range. Lower bound should be less than upper bound."
        );
      } else {
        Collections.sort(lines);
        System.out.println("Numbers: ");
        for (int l : lines) {
          if (lowerBound < l && upperBound > l) {
            System.out.println(l);
          }
        }
      }
    } catch (IOException e) {
      System.out.println("Couldn't open text file " + fileName);
    }

    scanner.close();
  }
}
