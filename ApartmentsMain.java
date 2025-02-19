public class ApartmentsMain {

  public static void main(String[] args) {
    Apartment manhattan = new Apartment(1, 16, 5500);
    Apartment atlanta = new Apartment(2, 38, 4200);
    System.out.println(manhattan.largerThan(atlanta));
    System.out.println(manhattan.moreExpensiveThan(atlanta));
    System.out.println(manhattan.priceDifference(atlanta));
  }
}
