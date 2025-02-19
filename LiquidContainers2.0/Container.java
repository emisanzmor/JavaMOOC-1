public class Container {

  int totalLiquid;

  public Container() {
    this.totalLiquid = 0;
  }

  public int contains() {
    return this.totalLiquid;
  }

  public void add(int amount) {
    int spaceContainer = 100;
    spaceContainer -= this.totalLiquid;
    if (amount > 0) {
      if (spaceContainer >= amount) {
        this.totalLiquid += amount;
      } else {
        this.totalLiquid = 100;
      }
    }
  }

  public void remove(int amount) {
    if (amount > 0 && this.totalLiquid >= amount) {
      this.totalLiquid -= amount;
    } else {
      this.totalLiquid = 0;
    }
  }

  public String toString() {
    return "AMOUNT OF LIQUID: " + this.totalLiquid + "/100";
  }
}
