public class PaymentCard {

  private double balance;
  private String name;

  public PaymentCard(String name, double initBalance) {
    this.name = name;
    this.balance = initBalance;
  }

  public PaymentCard(double initBalance) {
    this.balance = initBalance;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getName() {
    return this.name;
  }

  public void eatAffordably() {
    if (this.balance >= 2.60) {
      this.balance -= 2.60;
    }
  }

  public void eatHeartily() {
    if (this.balance >= 4.60) {
      this.balance -= 4.60;
    }
  }

  public void addMoney(double money) {
    if (money >= 0) {
      this.balance += money;
    } else if (this.balance > 150) {
      this.balance = 150;
    }
  }

  public boolean takeMoney(double money) {
    if (this.balance >= money) {
      this.balance -= money;
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return "The card has a balance of " + this.balance + " euros.";
  }
}
