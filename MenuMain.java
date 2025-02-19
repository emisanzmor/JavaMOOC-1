public class MenuMain {

  public static void main(String[] args) {
    Menu menu = new Menu();

    menu.addMeal("Pizza");
    menu.addMeal("Burger");
    menu.addMeal("Lasagna");

    menu.printMeals();
    System.out.println();
    menu.addMeal("Pizza");

    menu.printMeals();
    System.out.println();
    menu.clearMeal("Lasagna");
    menu.clearMeal("Pizza");
    menu.printMeals();
    System.out.println();
    menu.clearMenu();

    menu.printMeals();
  }
}
