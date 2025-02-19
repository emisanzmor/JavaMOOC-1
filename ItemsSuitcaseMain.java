public class ItemsSuitcaseMain {

  public static void main(String[] args) {
    /*  
    System.out.println(suitcase);
    
    suitcase.addItem(brick);
    suitcase.printItems();
    System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
    System.out.println("Heaviest item: " + suitcase.heaviestItem()); */

    ItemPt6 book = new ItemPt6("Lord of the Rings", 2);
    ItemPt6 phone = new ItemPt6("Nokia 3210", 1);
    ItemPt6 brick = new ItemPt6("Brick", 4);

    SuitcasePt6 adasCase = new SuitcasePt6(10);
    adasCase.addItem(book);
    adasCase.addItem(phone);

    SuitcasePt6 pekkasCase = new SuitcasePt6(10);
    pekkasCase.addItem(brick);

    HoldPt6 hold = new HoldPt6(1000);
    hold.addSuitcase(adasCase);
    hold.addSuitcase(pekkasCase);

    System.out.println(hold);

    System.out.println("Ada's case contains: ");
    adasCase.printItems();
  }
}
