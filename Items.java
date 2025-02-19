import java.util.ArrayList;
import java.util.Scanner;

public class Items {

  public static void main(String[] args) {
    ArrayList<Item> Item = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Enter names from items: ");
      String itemName = scanner.nextLine();

      if (itemName.isEmpty()) {
        System.out.println("QUITTING...");
        break;
      }

      Item.add(new Item(itemName));
    }

    System.out.println(Item.toString());

    scanner.close();
  }
}
