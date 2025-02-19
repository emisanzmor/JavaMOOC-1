import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static int linearSearch(ArrayList<Book> books, int searchId) {
    int index = -1;
    for (Book book : books) {
      index++;
      if (searchId == book.getId()) {
        return index;
      }
    }
    return index;
  }

  public static int binarySearch(ArrayList<Book> books, int searchId) {
    int begin = 0;
    int end = books.size() - 1;

    while (begin <= end) {
      int middle = (end + begin) / 2;

      if (books.get(middle).getId() == searchId) {
        return middle;
      } else if (books.get(middle).getId() < searchId) {
        begin = middle + 1;
      } else if (books.get(middle).getId() > searchId) {
        end = middle - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    ArrayList<Book> books = new ArrayList<>();
    books.add(new Book(15, "Quijote"));
    books.add(new Book(4, "Principito"));
    books.add(new Book(2, "Steve Jobs"));
    books.add(new Book(19, "Bible"));

    System.out.println("\nBOOKS LIST: ");
    for (Book book : books) {
      System.out.println(book);
    }

    System.out.println("Con búsqueda linear: " + linearSearch(books, 2));

    //IMPORTANTE APRENDER MÁS DE ESTO: NO QUEDA CLARO EL USO DE "->"
    Collections.sort(books, (book1, book2) ->
      Integer.compare(book1.getId(), book2.getId())
    );

    System.out.println(
      "Con búsqueda binaria iterativa: " + binarySearch(books, 4)
    );
  }
}
