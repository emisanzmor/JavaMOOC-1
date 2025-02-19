public class Song {

  private String name;
  private int length;

  public Song(String name, int length) {
    this.name = name;
    this.length = length;
  }

  public String name() {
    return this.name;
  }

  public int length() {
    return this.length;
  }

  public void printSong() {
    System.out.println(
      "The song " + name() + " has a length of " + length() + " minutes."
    );
  }
}
