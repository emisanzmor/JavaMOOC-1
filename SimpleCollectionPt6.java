import java.util.ArrayList;

public class SimpleCollectionPt6 {

  private String name;
  private ArrayList<String> elements;

  public SimpleCollectionPt6(String name) {
    this.name = name;
    this.elements = new ArrayList<>();
  }

  public void add(String element) {
    this.elements.add(element);
  }

  public ArrayList<String> getElements() {
    return this.elements;
  }

  public String largest() {
    if (elements.isEmpty()) {
      return "List is empty - " + null;
    }

    String returnObject = this.elements.get(0);

    for (String i : this.elements) {
      if (i.length() > returnObject.length()) {
        returnObject = i;
      }
    }
    return returnObject;
  }
}
