import java.util.Objects;

public class PersonDate {

  private String name;
  private SimpleDate birthday;
  private int height;
  private int weight;

  public PersonDate(String name, SimpleDate birthday, int height, int weight) {
    this.name = name;
    this.birthday = birthday;
    this.height = height;
    this.weight = weight;
  }

  // implement an equals method here for checking the equality of objects

  public boolean equals(Object compared) {
    if (this == compared) {
      return true;
    }

    if (!(compared instanceof PersonDate)) {
      return false;
    }

    PersonDate comparedPDate = (PersonDate) compared;

    if (
      this.name.equals(comparedPDate.name) &&
      this.birthday.equals(comparedPDate.birthday) &&
      this.height == comparedPDate.height &&
      this.weight == comparedPDate.weight
    ) {
      return true;
    }
    return false;
  }
}
