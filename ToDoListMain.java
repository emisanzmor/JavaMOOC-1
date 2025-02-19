import java.util.Scanner;

public class ToDoListMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ToDoList todo = new ToDoList();
    UserInterface user = new UserInterface(todo, scanner);

    user.start();
  }
}
