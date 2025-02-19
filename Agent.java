public class Agent {

  private String name;
  private String lastname;

  public Agent(String initName, String initLastName) {
    this.name = initName;
    this.lastname = initLastName;
  }

  public String toString() {
    return (
      "My name is " + this.lastname + ", " + this.name + " " + this.lastname
    );
  }
}
