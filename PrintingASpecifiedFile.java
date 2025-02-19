import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingASpecifiedFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    System.out.println("Which file should have it's contents printed?");

    String input = scanner.nextLine();

    try (Scanner textdoc = new Scanner(Paths.get(input))) {
      while (textdoc.hasNextLine()) {
        String line = textdoc.nextLine();
        lines.add(line);
      }
      System.out.println("Document had these lines: ");
      for (String line : lines) {
        System.out.println(line);
      }
      System.out.println("Number of lines: " + lines.size());
    } catch (IOException e) {
      System.out.println("Couldn't open file.");
    }
    scanner.close();
  }
}
