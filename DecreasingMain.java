public class DecreasingMain {

  public static void main(String[] args) {
    DecreasingCounter counter = new DecreasingCounter(9);

    counter.printValue();

    counter.reset();
    counter.printValue();

    counter.decrement();
    counter.printValue();
  }
}
