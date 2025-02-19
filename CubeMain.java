import java.util.Scanner;

public class CubeMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the value of the cube edge length: ");
    int edgeLength = Integer.parseInt(scanner.nextLine());

    if (edgeLength <= 0) {
      System.out.println("Value cannot be under 0. Try again.");
    }

    Cube cube = new Cube(edgeLength);
    System.out.println(cube);
    scanner.close();
  }
}
