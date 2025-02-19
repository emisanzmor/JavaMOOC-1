import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();

    System.out.println("Name of the file: ");
    String input = scanner.nextLine();

    try (Scanner textdoc = new Scanner(Paths.get(input))) {
      while (textdoc.hasNextLine()) {
        String line = textdoc.nextLine();
        lines.add(line);
      }

      System.out.println("Enter names. An empty line quits.");

      while (true) {
        String search = scanner.nextLine();

        if (search.isEmpty()) {
          System.out.println("QUITTING...");
          break;
        }

        boolean found = false;
        for (String l : lines) {
          if (l.contains(search)) {
            System.out.println("The name is on the list");
            found = true;
            break;
          }
        }

        if (!found) {
          System.out.println("The name is not on the list.");
        }
      }
    } catch (IOException e) {
      System.out.println("Couldn't open file " + input);
    }
    scanner.close();
  }
}
