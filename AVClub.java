import java.util.Scanner;

public class AVClub {

  Scanner scanner = new Scanner(System.in);

  public void AV() {
    System.out.println("Enter a string: ");
    String sentence = scanner.nextLine();

    String[] split = sentence.split(" ");

    System.out.println("Array contains: " + split.length + " words");

    for (String index : split) {
      if (index.toLowerCase().contains("av")) {
        System.out.println(index);
      }
    }
  }

  public static void main(String[] args) {
    AVClub av = new AVClub();
    av.AV();
  }
}
