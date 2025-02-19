public class SimpleDateP5Main {

  public static void main(String[] args) {
    SimpleDateP5 date = new SimpleDateP5(13, 2, 2015);
    System.out.println("Friday of the examined week is " + date);

    SimpleDateP5 newDate = date.afterNumberOfDays(7);
    int week = 1;
    while (week <= 7) {
      System.out.println("Friday after " + week + " weeks is " + newDate);
      newDate = newDate.afterNumberOfDays(7);

      week = week + 1;
    }

    System.out.println(
      "The date after 790 days from the examined Friday is ... try it out yourself!"
    );
    System.out.println("Try " + date.afterNumberOfDays(790));
  }
}
