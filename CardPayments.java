public class CardPayments {

  public static void main(String[] args) {
    PaymentCard peter = new PaymentCard("Peter", 100);
    System.out.println(peter.getName() + ": " + peter);
    boolean wasSuccessful = peter.takeMoney(10);
    System.out.println("Successfully withdrew: " + wasSuccessful);
    System.out.println(peter.getName() + ": " + peter);
  }
}
