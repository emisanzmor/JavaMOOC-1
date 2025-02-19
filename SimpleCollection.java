import java.util.ArrayList;

public class SimpleCollection {

  private String name;
  private ArrayList<String> elements;

  public SimpleCollection(String name) {
    this.name = name;
    this.elements = new ArrayList<>();
  }

  public void add(String element) {
    this.elements.add(element);
  }

  public ArrayList<String> getElements() {
    return this.elements;
  }

  public String toString() {
    if (elements.isEmpty()) {
      return "The collection " + this.name + " is empty.";
    }

    StringBuilder elementsOnList = new StringBuilder();
    for (String element : this.elements) {
      elementsOnList.append(element).append("\n");
    }

    String elementText;
    if (elements.size() == 1) {
      elementText = " element";
    } else {
      elementText = " elements";
    }

    String printOutput =
      "The collection " +
      this.name +
      " has " +
      elements.size() +
      elementText +
      "\n" +
      elementsOnList;

    return printOutput;
  }
}
