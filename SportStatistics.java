import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

  public static ArrayList<Games> readRecordsFromFile(String file) {
    ArrayList<Games> games = new ArrayList<>();

    try (Scanner csvfile = new Scanner(Paths.get(file))) {
      while (csvfile.hasNextLine()) {
        String line = csvfile.nextLine();

        String[] splitted = line.split(",");
        String local = splitted[0];
        String visitor = splitted[1];
        int wins = Integer.parseInt(splitted[2]);
        int loses = Integer.parseInt(splitted[3]);

        games.add(new Games(local, visitor, wins, loses));
      }
    } catch (IOException e) {
      System.out.println("Couldn't open file.");
    }
    return games;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter file name: ");
    String fileName = scanner.nextLine();

    ArrayList<Games> games = readRecordsFromFile(fileName);

    System.out.println("Search for team stats: ");
    String team = scanner.nextLine();

    int totalGames = 0;
    Boolean found = false;

    for (Games g : games) {
      if (
        g.getLocal().equalsIgnoreCase(team) ||
        g.getVisitor().equalsIgnoreCase(team)
      ) {
        System.out.println(g);

        found = true;
        totalGames++;
      }
    }

    if (found) {
      System.out.println("Total amount of games from this team: " + totalGames);
    } else {
      System.out.println("No stats found for: " + team);
    }
    scanner.close();
  }
}
