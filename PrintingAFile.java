import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingAFile {

  public static void main(String[] args) {
    ArrayList<String> lines = new ArrayList<>();
    try (
      Scanner scanner = new Scanner(
        Paths.get("/Users/emisanzmor/coding/file.txt")
      )
    ) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        lines.add(line);
      }
      System.out.println("File was read as: ");
      for (String nLine : lines) {
        System.out.println(nLine);
        System.out.println("File had: " + lines.size() + " lines.");
      }
    } catch (IOException e) {
      System.out.println("Couldn't open file.");
      e.printStackTrace();
    }
  }
}
