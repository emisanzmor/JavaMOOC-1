public class CounterMain {

  public static void main(String[] args) {
    Counter counter1 = new Counter(10);
    Counter counter2 = new Counter();

    System.out.println("1: " + counter1);
    counter1.decrease();
    counter1.decrease();
    System.out.println("1: " + counter1);
    counter1.increase();
    System.out.println("1: " + counter1);

    System.out.println("2: " + counter2);
    counter2.increase();
    counter2.increase();
    System.out.println("2: " + counter2);
    counter2.decrease();
    System.out.println("2: " + counter2);
  }
}
