public class PersonDateMain {

  public static void main(String[] args) {
    SimpleDate date = new SimpleDate(24, 3, 2017);
    SimpleDate date2 = new SimpleDate(23, 7, 2017);
    PersonDate leo = new PersonDate("Leo", date, 62, 9);
    PersonDate lily = new PersonDate("Lily", date2, 65, 8);

    if (leo.equals(lily)) {
      System.out.println("Is this quite correct?");
    }

    PersonDate leoWithDifferentHeight = new PersonDate("Leo", date, 62, 10);

    if (leo.equals(leoWithDifferentHeight)) {
      System.out.println("Is this quite correct?");
    }
  }
}
