public class ProductOLMain {

  public static void main(String[] args) {
    ProductOL tapeMeasure = new ProductOL("Tape measure");
    ProductOL plaster = new ProductOL("Plaster", "home improvement section");
    ProductOL tyre = new ProductOL("Tyre", 5);

    System.out.println(tapeMeasure);
    System.out.println(plaster);
    System.out.println(tyre);
  }
}
