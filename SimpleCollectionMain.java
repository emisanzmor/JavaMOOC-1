public class SimpleCollectionMain {

  public static void main(String[] args) {
    SimpleCollection characters = new SimpleCollection("Characters");
    System.out.println(characters);

    characters.add("Goofy");
    System.out.println(characters);
    characters.add("Mickey");
    System.out.println(characters);
  }
}
