public class Booksp5 {

  private String name;
  private int publicationYear;

  public Booksp5(String name, int publicationYear) {
    this.name = name;
    this.publicationYear = publicationYear;
  }

  public String getName() {
    return name;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public boolean equals(Object compared) {
    if (this == compared) {
      return true;
    }

    if (!(compared instanceof Booksp5)) {
      return false;
    }

    Booksp5 comparedBooks = (Booksp5) compared;

    return (this.name.equals(comparedBooks.name));
  }
}
