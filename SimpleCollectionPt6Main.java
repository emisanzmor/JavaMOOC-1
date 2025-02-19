public class SimpleCollectionPt6Main {

  public static void main(String[] args) {
    SimpleCollectionPt6 simple = new SimpleCollectionPt6("Items");
    simple.add("Sword");
    simple.add("Axe");
    simple.add("Pickaxe");
    System.out.println(simple.getElements());
    System.out.println("Longest: " + simple.largest());
  }
}
