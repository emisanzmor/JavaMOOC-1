import java.util.Scanner;

public class JokeManagerMenu {

  JokeManager jokeManager;
  Scanner scanner;
  String option;
  boolean menu = true;

  public JokeManagerMenu(JokeManager jokeManager, Scanner scanner) {
    this.jokeManager = jokeManager;
    this.scanner = scanner;
  }

  public void showMenu() {
    System.out.println("Options: ");
    System.out.println("1. Add a  joke.");
    System.out.println("2. Draw a joke");
    System.out.println("3. Print jokes");
    System.out.println("X. Stop");
    System.out.println();
  }

  public boolean isValidOption(String option) {
    return (
      option.equals("1") ||
      option.equals("2") ||
      option.equals("3") ||
      option.equals("X")
    );
  }

  public String showInvalidOptionMessage() {
    return "Invalid option. Try again.";
  }

  public void options() {
    switch (option) {
      case "X":
        System.out.println("Quitting...");
        menu = false;
        break;
      case "1":
        System.out.println("Enter a joke: ");
        if (joke.isEmpty()) {
          System.out.println("Joke is empty.");
        } else {
          String joke = scanner.nextLine();
          this.jokeManager.addJoke(joke);
        }
        break;
      case "2":
        System.out.println(this.jokeManager.drawJoke());
        break;
      case "3":
        this.jokeManager.printJokes();
        break;
      default:
        showInvalidOptionMessage();
        break;
    }
  }

  public void mainMenu() {
    while (menu) {
      showMenu();
      System.out.println("Enter an option: ");
      option = scanner.nextLine().trim().toUpperCase();

      if (!isValidOption(option)) {
        System.out.println(showInvalidOptionMessage());
        continue;
      }
      options();
    }
  }
}
