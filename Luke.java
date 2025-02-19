public class Luke {

  private String name;

  public Luke(String name) {
    this.name = name;
  }

  public String addString() {
    return "Luke is " + name;
  }

  public static void main(String[] args) {
    Luke luke = new Luke("Luke");
    System.out.println(luke);
  }
}
