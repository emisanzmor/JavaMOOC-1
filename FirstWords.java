import java.util.Scanner;

public class FirstWords {

  Scanner scanner = new Scanner(System.in);

  public void Split() {
    while (true) {
      System.out.println("Enter a string: (Press ENTER to stop)");
      String sentence = scanner.nextLine();

      if (sentence.isEmpty()) {
        break;
      }

      String[] split = sentence.split(" ");

      if (split.length > 0) { // Imprime primera palabra:
        System.out.println("First word: ");
        System.out.println(split[0]);
      }

      if (split.length > 0) { // Imprime ultima palabra:
        System.out.println("Last word: ");
        System.out.println(split[split.length - 1]);
      }
    }
  }

  public static void main(String[] args) {
    FirstWords first = new FirstWords();
    first.Split();
  }
}
