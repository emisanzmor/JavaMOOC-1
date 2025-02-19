import java.util.ArrayList;

public class Package {

  ArrayList<Gift> gifts = new ArrayList<>();

  public Package() {}

  public void addGift(Gift gift) {
    this.gifts.add(gift);
  }

  public int totalWeight() {
    int totalWeight = 0;
    for (Gift g : this.gifts) {
      totalWeight += g.getWeight();
    }
    return totalWeight;
  }

  public void showGifts() {
    if (gifts.isEmpty()) {
      System.out.println("No gifts in the package.");
    } else {
      for (Gift gift : gifts) {
        System.out.println(gift);
      }
    }
  }
}
