import java.util.Scanner;

public class ContainerUI {

  Container container;
  String commandLowerCase;
  boolean shouldLoop = true;
  int amount;
  Scanner scanner = new Scanner(System.in);

  public ContainerUI(Container container, Scanner scanner) {
    this.container = container;
    this.scanner = scanner;
    this.amount = 0;
  }

  public void showMenu() {
    System.out.println(
      "Options: \n Add <amount>\n Remove <amount>\n Quit<amount>\n"
    );
  }

  public void mainMenu() {
    while (shouldLoop) {
      System.out.println("\n" + container.toString() + "\n");

      showMenu();
      System.out.println("Enter an option and it's value (e.g. Add 30)");

      String input = scanner.nextLine();
      processInput(input);
    }
  }

  public void processInput(String input) {
    try {
      String parts[] = input.split(" ");
      String command = parts[0];
      if (command.equals("quit")) {
        shouldLoop = false;
        return;
      }

      commandLowerCase = command.toLowerCase();

      amount = Integer.parseInt(parts[1]);

      //OPCIONES SEGÚN EL INPUT:
      switch (commandLowerCase) {
        case "add":
          container.add(amount);
          break;
        case "remove":
          container.remove(amount);
          break;
        default:
          System.out.println("Invalid command. Try again.");
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Invalid option. Try again.");
    }
  }
}
