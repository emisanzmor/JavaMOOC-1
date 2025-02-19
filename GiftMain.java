import java.util.ArrayList;
import java.util.Scanner;

public class GiftMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Package giftWrap = new Package(); //Wrapping gifts in a package.

    boolean empty = false;
    while (!empty) {
      System.out.println("Enter the gift's name: ");
      String name = scanner.nextLine();

      if (name.isEmpty()) {
        empty = true;
        break;
      }

      System.out.println("Enter the gift's weight: ");
      try {
        int weight = Integer.parseInt(scanner.nextLine());
        Gift gift = new Gift(name, weight); //Creates gifts.
        System.out.println(gift);
        giftWrap.addGift(gift);
      } catch (NumberFormatException e) {
        System.out.println("Enter a valid weight. Strings not accepted.");
      }
    }

    System.out.println(
      "Packages total weight: " + giftWrap.totalWeight() + " kg"
    ); //Total package weight.

    giftWrap.showGifts(); // Shows gifts in ArrayList.

    scanner.close();
  }
}
