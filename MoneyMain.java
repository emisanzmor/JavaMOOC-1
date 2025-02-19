public class MoneyMain {

  public static void main(String[] args) {
    Money juan = new Money(11, 6);
    Money luis = new Money(11, 5);
    System.out.println(juan.euros());
    System.out.println(juan.cents());
    System.out.println(juan.plus(luis));
    System.out.println(juan.minus(luis));
    System.out.println("JUAN: " + juan);
    System.out.println("LUIS: " + luis);
    System.out.println(juan.lessThan(luis));
  }
}
