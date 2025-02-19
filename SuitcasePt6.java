import java.util.ArrayList;

public class SuitcasePt6 {

  ArrayList<ItemPt6> items;
  private int maxWeight;
  private int totalWeight;

  public SuitcasePt6(int maxWeight) {
    this.items = new ArrayList<>();
    this.maxWeight = maxWeight;
    this.totalWeight = 0;
  }

  public void addItem(ItemPt6 item) {
    if (this.totalWeight + item.getWeight() < this.maxWeight) {
      this.items.add(item);
    }
  }

  public String toString() {
    if (items.size() == 1) {
      return items.size() + " item " + "(" + this.totalWeight + "kg)";
    } else if (items.isEmpty()) {
      return "No items in suitcase.";
    } else {
      return items.size() + " items " + "(" + this.totalWeight + "kg)";
    }
  }

  public int totalWeight() {
    int weight = 0;
    for (ItemPt6 i : this.items) {
      weight += i.getWeight();
    }
    return weight;
  }

  public void printItems() {
    for (ItemPt6 i : items) {
      System.out.println(i);
    }
  }

  public ItemPt6 heaviestItem() {
    ItemPt6 heaviestItem = this.items.get(0);

    if (this.items.isEmpty()) {
      return null;
    }

    for (ItemPt6 i : this.items) {
      if (i.getWeight() > heaviestItem.getWeight()) {
        heaviestItem = i;
      }
    }
    return heaviestItem;
  }
}
