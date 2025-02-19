import java.util.Scanner;

public class FilmName {

  public static void main(String[] args) {
    Film film = new Film("Cars", 18);

    Scanner scanner = new Scanner(System.in);

    System.out.println("How old are you?");
    int age = Integer.parseInt(scanner.nextLine());

    if (age >= film.ageRating) {
      System.out.println("You are eligible to watch " + film.name());
    } else {
      System.out.println("You are not eligible to watch " + film.name());
    }
  }
}
