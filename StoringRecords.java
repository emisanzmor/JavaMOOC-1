import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

  public static ArrayList<Person> readRecordsFromFile(String file) {
    ArrayList<Person> persons = new ArrayList<>();

    try (Scanner csvfile = new Scanner(Paths.get(file))) {
      while (csvfile.hasNextLine()) {
        String line = csvfile.nextLine();

        String[] splitted = line.split(",");
        String name = splitted[0];
        int age = Integer.parseInt(splitted[1]);

        persons.add(new Person(name, age));
      }
    } catch (IOException e) {
      System.out.println("Couldn't open file.");
    }
    return persons;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter file name: ");
    String fileName = scanner.nextLine();

    ArrayList<Person> persons = readRecordsFromFile(fileName);
    for (Person p : persons) {
      System.out.println(p);
    }
    scanner.close();
  }
}
