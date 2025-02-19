import java.util.Scanner;

public class TextUI {

  private Scanner scanner;
  private SimpleDictionary simpleDict;

  public TextUI(Scanner scanner, SimpleDictionary simpleDict) {
    this.scanner = scanner;
    this.simpleDict = simpleDict;
  }

  public void start() {
    while (true) {
      System.out.println("Enter a command: ");
      String command = scanner.nextLine();

      if (command.equalsIgnoreCase("end")) {
        System.out.println("Bye bye!");
        break;
      } else if (command.equalsIgnoreCase("add")) {
        System.out.println("Give me a word: ");
        String word = scanner.nextLine();

        System.out.println("Give me it's translation: ");
        String translation = scanner.nextLine();

        this.simpleDict.add(word, translation);
      } else if (command.equalsIgnoreCase("search")) {
        System.out.println("Enter a word to find it's translation: ");
        String search = scanner.nextLine();
        String translation = simpleDict.translate(search);

        if (translation == null) {
          System.out.println("Word " + search + " was not found.");
        } else {
          System.out.println("Translation of " + search + ": " + translation);
        }
        continue;
      } else {
        System.out.println("Unknown command.");
      }
    }
  }
}
