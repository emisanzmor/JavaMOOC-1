import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BookOOPMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String author = "";
    String name = "";
    int pages = 0;
    boolean validinput = false;

    while (!validinput) {
      System.out.println("Enter author: ");
      author = scanner.nextLine();

      if (author.isEmpty()) {
        System.out.println("Author can't be empty. Try again.");
        continue;
      }

      System.out.println("Enter name: ");
      name = scanner.nextLine();
      if (name.isEmpty()) {
        System.out.println("Name can't be empty. Try again.");
        continue;
      }

      System.out.println("Enter pages: ");
      try {
        pages = Integer.parseInt(scanner.nextLine());

        if (pages <= 0) {
          System.out.println("Pages value can't be negative. Try again.");
          continue;
        }

        validinput = true;
      } catch (NumberFormatException e) {
        System.out.println("Invalid number. Enter a valid number.");
      }
    }
    BookOOP book = new BookOOP(author, name, pages);
    System.out.println(book);
    scanner.close();
  }
}
