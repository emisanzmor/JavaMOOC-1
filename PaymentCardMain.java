public class PaymentCardMain {

  public static void main(String[] args) {
    PaymentCard payment = new PaymentCard(100);

    System.out.println(payment.toString());
    payment.eatHeartily();
    System.out.println(payment.toString());
    payment.addMoney(-10);
    System.out.println(payment.toString());

    PaymentCard paul = new PaymentCard(20);
    PaymentCard matt = new PaymentCard(30);
    paul.eatHeartily();
    matt.eatAffordably();
    System.out.println("Paul's: " + paul.toString());
    System.out.println("Matt's: " + matt.toString());
    paul.addMoney(20);
    matt.eatHeartily();
    System.out.println("Paul's: " + paul.toString());
    System.out.println("Matt's: " + matt.toString());
    paul.eatAffordably();
    paul.eatAffordably();
    matt.addMoney(50);
    System.out.println("Paul's: " + paul.toString());
    System.out.println("Matt's: " + matt.toString());
  }
}
