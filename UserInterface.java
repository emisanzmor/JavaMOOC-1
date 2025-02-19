import java.util.Scanner;

public class UserInterface {

  private ToDoList todo;
  private Scanner scanner;

  public UserInterface(ToDoList todo, Scanner scanner) {
    this.scanner = scanner;
    this.todo = todo;
  }

  public void start() {
    while (true) {
      System.out.println("Enter a command: ");
      String command = scanner.nextLine();

      if (command.equalsIgnoreCase("stop")) {
        break;
      } else if (command.equalsIgnoreCase("add")) {
        System.out.println("Enter a task to be added: ");
        String task = scanner.nextLine();
        todo.add(task);
      } else if (command.equalsIgnoreCase("list")) {
        todo.print();
      } else if (command.equalsIgnoreCase("remove")) {
        System.out.println("Number to remove: ");
        try {
          int numberToRemove = Integer.parseInt(scanner.nextLine());
          todo.remove(numberToRemove);
        } catch (NumberFormatException e) {
          System.out.println("Entry not valid");
        }
      } else if (command.equalsIgnoreCase("help")) {
        System.out.println("Commands available: ");
        System.out.println(" - stop\n - add\n - list\n - remove\n - help");
      } else {
        System.out.println("Command not found. Try command: \n- help \n");
      }
    }
  }
}
