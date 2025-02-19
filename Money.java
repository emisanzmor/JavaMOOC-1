public class Money {

  private final int euros;
  private final int cents;

  public Money(int euros, int cents) {
    this.euros = euros;
    this.cents = cents;
  }

  public int euros() {
    return euros;
  }

  public int cents() {
    return cents;
  }

  public String toString() {
    String zero = "";
    if (cents < 10) {
      zero = "0";
    }

    return euros + "." + zero + cents + "e";
  }

  public Money plus(Money addition) {
    Money newMoney = new Money(
      this.euros + addition.euros,
      this.cents + addition.cents
    );

    return newMoney;
  }

  public boolean lessThan(Money compared) {
    if (this.euros < compared.euros) {
      return true;
    }

    if (this.euros == compared.euros && this.cents < compared.cents) {
      return true;
    }

    return false;
  }

  public Money minus(Money decreaser) {
    int thisTotalCents = this.euros * 100 + this.cents;
    int decreaserTotalCents = decreaser.euros * 100 + decreaser.cents;
    int resultTotalCents = thisTotalCents - decreaserTotalCents;

    if (resultTotalCents < 0) {
      return new Money(0, 0);
    }
    int newEuros = resultTotalCents / 100;
    int newCents = resultTotalCents % 100;

    return new Money(newEuros, newCents);
  }
}
