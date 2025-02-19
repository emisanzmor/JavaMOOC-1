import java.util.Scanner;

public class Login {

  Scanner scanner = new Scanner(System.in);

  public void username() {
    System.out.println("Enter username: ");
    String username = scanner.nextLine();

    if (username.equals("Emi")) {
      System.out.println("Welcome " + username);
    } else {
      System.out.println("Incorrect username.A");
    }
  }

  public static void main(String[] args) {
    Login login = new Login();
    login.username();
  }
}
