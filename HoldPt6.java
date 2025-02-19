import java.util.ArrayList;

public class HoldPt6 {

  private int maxWeight;
  ArrayList<SuitcasePt6> suitcases;

  public HoldPt6(int maxWeight) {
    this.maxWeight = maxWeight;
    suitcases = new ArrayList<>();
  }

  public void addSuitcase(SuitcasePt6 suitcase) {
    if (totalHoldWeight() + suitcase.totalWeight() < this.maxWeight) {
      this.suitcases.add(suitcase);
    }
  }

  public String toString() {
    return suitcases.size() + " suitcases " + "(" + totalHoldWeight() + "kg)";
  }

  public int totalHoldWeight() {
    int weight = 0;
    for (SuitcasePt6 s : this.suitcases) {
      weight += s.totalWeight();
    }
    return weight;
  }

  public void printItems() {
    for (SuitcasePt6 s : this.suitcases) {
      System.out.println(s);
    }
  }
}
