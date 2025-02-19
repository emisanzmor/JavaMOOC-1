import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

  ArrayList<String> jokes;

  public JokeManager() {
    jokes = new ArrayList<>();
  }

  public void addJoke(String joke) {
    this.jokes.add(joke);
  }

  public String drawJoke() {
    System.out.println("Drawing jokes...");
    if (this.jokes.isEmpty()) {
      return "Jokes are in short supply.";
    } else {
      Random random = new Random();
      int index = random.nextInt(jokes.size());
      return jokes.get(index);
    }
  }

  public void printJokes() {
    for (String joke : this.jokes) {
      System.out.println(joke);
    }
  }
}
