public class PaymentTerminalMain {

  public static void main(String[] args) {
    PaymentTerminal term = new PaymentTerminal();

    double change = term.eatAffordably(10);
    System.out.println("Remaining change: " + change);

    PaymentCard annesCard = new PaymentCard(7);

    boolean wasSuccessful = term.eatHeartily(annesCard);
    System.out.println("There was enough money: " + wasSuccessful);
    wasSuccessful = term.eatHeartily(annesCard);
    term.addMoneyToCard(annesCard, 20);
    System.out.println("There was enough money: " + wasSuccessful);
    wasSuccessful = term.eatAffordably(annesCard);
    System.out.println("There was enough money: " + wasSuccessful);

    System.out.println(term);
  }
}
