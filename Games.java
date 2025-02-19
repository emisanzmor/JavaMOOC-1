public class Games {

  private String local;
  private String visitor;
  private int wins;
  private int loses;

  public Games(String local, String visitor, int wins, int loses) {
    this.local = local;
    this.visitor = visitor;
    this.wins = wins;
    this.loses = loses;
  }

  public String getLocal() {
    return this.local;
  }

  public String getVisitor() {
    return this.visitor;
  }

  public int getWins() {
    return this.wins;
  }

  public int getLoses() {
    return this.loses;
  }

  @Override
  public String toString() {
    return (
      "Team: " +
      getLocal() +
      " vs " +
      getVisitor() +
      ", Wins: " +
      getWins() +
      ", Loses: " +
      getLoses() +
      "."
    );
  }
}
