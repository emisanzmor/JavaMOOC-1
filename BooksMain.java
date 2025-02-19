import java.lang.classfile.instruction.ArrayLoadInstruction;
import java.util.ArrayList;
import java.util.Scanner;

public class BooksMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    while (true) {
      System.out.println("Give me a book title: ");
      String title = scanner.nextLine();

      if (title.isEmpty()) {
        System.out.println("QUITTING...");
        break;
      }

      System.out.println("Give me it's number of pages: ");
      String pages = scanner.nextLine();

      System.out.println("Give me it's publication year: ");
      String publicationYear = scanner.nextLine();

      books.add(
        new Book(
          title,
          Integer.parseInt(pages),
          Integer.parseInt(publicationYear)
        )
      );
    }

    while (true) {
      String input;
      System.out.println("What information will be printed?");
      input = scanner.nextLine();

      if (input.equalsIgnoreCase("everything")) {
        for (Book b : books) {
          System.out.println(b.toString());
        }
        break;
      } else if (input.equalsIgnoreCase("title")) {
        for (Book b : books) {
          System.out.println(b.getTitle());
        }
        break;
      } else {
        System.out.println("Input not valid.");
      }
    }
    scanner.close();
  }
}
