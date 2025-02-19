import java.util.ArrayList;

public class Stack {

  ArrayList<String> stack;

  public Stack() {
    this.stack = new ArrayList<>();
  }

  public boolean isEmpty() {
    if (this.stack.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public void add(String value) {
    String valueToLowerCase = value.toLowerCase();
    boolean valueExists = false;

    for (String valueIndex : this.stack) {
      if (valueIndex.toLowerCase().equals(valueToLowerCase)) {
        valueExists = true;
        break;
      }
    }

    if (!valueExists) {
      this.stack.add(value);
      System.out.println(value + " is being added.");
    } else {
      System.out.println(value + ": already added");
    }
  }

  public ArrayList<String> values() {
    return this.stack;
  }

  public String take() {
    String last = "";
    if (!this.stack.isEmpty()) {
      last = this.stack.get(this.stack.size() - 1);
      this.stack.remove(last);
    }

    return last;
  }
}
