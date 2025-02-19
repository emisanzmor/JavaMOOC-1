import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> ages = new ArrayList<>();

    System.out.println("Name of the file: ");
    String fileName = scanner.nextLine();

    try (Scanner file = new Scanner(Paths.get(fileName))) {
      while (file.hasNextLine()) {
        String nameage = file.nextLine();
        String[] splitted = nameage.split(",");
        String name = splitted[0];
        int age = Integer.parseInt(splitted[1]);

        names.add(name);
        ages.add(age);
      }

      for (int i = 0; i < names.size(); i++) {
        String name = (names.get(i));
        int age = (ages.get(i));

        System.out.print(name);
        System.out.print(", age " + age);

        if (age == 1) {
          System.out.println(" year");
        } else {
          System.out.println(" years");
        }
      }
    } catch (IOException e) {
      System.out.println("Couldn't open csv file");
    }

    scanner.close();
  }
}
