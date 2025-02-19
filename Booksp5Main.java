import java.util.ArrayList;
import java.util.Scanner;

public class Booksp5Main {

  public static void main(String[] args) {
    ArrayList<Booksp5> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Name: (Empty will stop)");
      String name = scanner.nextLine();
      if (name.isEmpty()) {
        break;
      }
      System.out.println("Publication year: ");
      int year = Integer.parseInt(scanner.nextLine());
      Booksp5 book = new Booksp5(name, year);
      if (!(books.contains(book))) {
        books.add(book);
      } else {
        System.out.println(" Book already on the list ");
      }
    }

    System.out.println("Books added: " + books.size());
    System.out.println("Names and publication year: ");
    for (Booksp5 b : books) {
      System.out.println(b.getName() + " " + b.getPublicationYear());
    }

    scanner.close();
  }
}
