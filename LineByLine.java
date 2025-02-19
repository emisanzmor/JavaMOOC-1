import java.util.Scanner;

public class LineByLine {

  Scanner scanner = new Scanner(System.in);

  public void line() {
    System.out.println("Enter a String:");
    String sentence = scanner.nextLine();

    String[] splitted = sentence.split(" ");

    System.out.println(
      "El tamaño del Array después de usar split es: " + splitted.length
    );

    for (String index : splitted) {
      System.out.println(index);
    }
  }

  public static void main(String[] args) {
    LineByLine line = new LineByLine();
    line.line();
  }
}
