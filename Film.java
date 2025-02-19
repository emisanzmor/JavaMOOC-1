public class Film {

  String name;
  int ageRating;

  public Film(String filmName, int filmAgeRating) {
    this.name = filmName;
    this.ageRating = filmAgeRating;
  }

  public String name() {
    return this.name;
  }

  public int age() {
    return this.ageRating;
  }
}
