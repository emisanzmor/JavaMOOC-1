import java.util.Scanner;

public class SimpleDictionaryMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SimpleDictionary dictionary = new SimpleDictionary();

    TextUI textui = new TextUI(scanner, dictionary);
    textui.start();
  }
}
