public class product {

  private double price;
  private int quantity;
  private String name;

  public product(String initialName, double initialPrice, int initialQuantity) {
    this.price = initialPrice;
    this.name = initialName;
    this.quantity = initialQuantity;
  }

  public void printProduct() {
    System.out.println(
      "Product: " +
      this.name +
      "\nPrice: " +
      this.price +
      "\nQuantity: " +
      this.quantity
    );
  }
}
