public class Timer {

  private ClockHand seconds;
  private ClockHand hundredths;

  public Timer() {
    this.seconds = new ClockHand(60);
    this.hundredths = new ClockHand(100);
  }

  public String toString() {
    return (
      this.seconds + "seconds, " + this.hundredths + " hundredths of a second."
    );
  }

  public void advance() {
    this.seconds.advance();

    if (this.seconds.value() == 0) {
      this.hundredths.advance();
    }
  }
}
