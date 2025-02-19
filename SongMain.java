public class SongMain {

  public static void main(String[] args) {
    Song song = new Song("Watcha Gonna Do", 2);
    System.out.println(song.name());
    System.out.println(song.length());
    song.printSong();
  }
}
