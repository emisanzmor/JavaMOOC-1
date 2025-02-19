public class SongMainTwo {

  public static void main(String[] args) {
    SongTwo song = new SongTwo("The Lonely Island", "Jack Sparrow", 196);
    SongTwo anotherSong = new SongTwo("The Lonely Island", "Jack Sparrow", 196);

    if (song.equals(anotherSong)) {
      System.out.println("Songs are equal.");
    }

    if (song.equals("Another object")) {
      System.out.println("Songs are not equal.");
    }
  }
}
