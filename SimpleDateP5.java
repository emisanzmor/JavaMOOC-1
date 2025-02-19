public class SimpleDateP5 {

  private int day;
  private int month;
  private int year;

  public SimpleDateP5(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String toString() {
    return this.day + "." + this.month + "." + this.year;
  }

  public void advance() {
    this.day = this.day + 1;
    if (this.month == 2 && this.day == 30) {
      this.day = 1;
      this.month = this.month + 1;
    } else if (this.month % 2 != 0 && this.day == 32) {
      this.day = 1;
      this.month = this.month + 1;
    } else if (this.month % 2 == 0 && this.day == 31) {
      this.day = 1;
      this.month = this.month + 1;
    }
    if (this.month == 13) {
      this.month = 1;
      this.year = this.year + 1;
    }
  }

  public void advance(int howManyDays) {
    for (int i = 0; i < howManyDays; i++) {
      this.advance();
    }
  }

  public SimpleDateP5 afterNumberOfDays(int days) {
    SimpleDateP5 newDate = new SimpleDateP5(this.day, this.month, this.year);
    newDate.advance(days);

    return newDate;
  }

  public boolean before(SimpleDateP5 compared) {
    // first compare years
    if (this.year < compared.year) {
      return true;
    }

    // if the years are the same, compare months
    if (this.year == compared.year && this.month < compared.month) {
      return true;
    }

    // the years and the months are the same, compare days
    if (
      this.year == compared.year &&
      this.month == compared.month &&
      this.day < compared.day
    ) {
      return true;
    }

    return false;
  }
}
