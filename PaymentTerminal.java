public class PaymentTerminal {

  private double money;
  private int affordableMeals = 0;
  private int heartyMeals = 0;

  public PaymentTerminal() {
    this.money = 1000;
  }

  public double eatAffordably(double payment) {
    if (payment >= 2.50) {
      payment -= 2.50;
      this.money += 2.50;
      this.affordableMeals += 1;
    }
    return payment;
  }

  public double eatHeartily(double payment) {
    if (payment >= 4.30) {
      payment -= 4.30;
      this.money += 4.30;
      heartyMeals += 1;
    }
    return payment;
  }

  public String toString() {
    return (
      "money: " +
      this.money +
      ", number of sold affordable meals: " +
      affordableMeals +
      ", number of sold hearty meals: " +
      heartyMeals
    );
  }

  public boolean eatAffordably(PaymentCard card) {
    if (card.getBalance() >= 2.50) {
      this.affordableMeals += 1;
      card.takeMoney(2.50);
      return true;
    } else {
      return false;
    }
  }

  public boolean eatHeartily(PaymentCard card) {
    if (card.getBalance() >= 4.30) {
      this.heartyMeals += 1;
      card.takeMoney(4.30);
      return true;
    } else {
      return false;
    }
  }

  public void addMoneyToCard(PaymentCard card, double sum) {
    if (sum > 0) {
      this.money -= sum;
      card.addMoney(sum);
    }
  }
}
