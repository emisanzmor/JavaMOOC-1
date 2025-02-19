import java.util.Scanner;

public class JokeManagerMain {

  public static void main(String[] args) {
    JokeManager jokeManager = new JokeManager();
    Scanner scanner = new Scanner(System.in);
    JokeManagerMenu menu = new JokeManagerMenu(jokeManager, scanner);

    menu.mainMenu();
  }
}
