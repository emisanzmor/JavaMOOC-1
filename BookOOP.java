public class BookOOP {

  private String author;
  private String name;
  int pages;

  public BookOOP(String author, String name, int pages) {
    this.author = author;
    this.name = name;
    this.pages = pages;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getName() {
    return this.name;
  }

  public int getPages() {
    return this.pages;
  }

  public String toString() {
    return (
      "Author: " + this.author + " Name: " + this.name + " Pages: " + this.pages
    );
  }
}
