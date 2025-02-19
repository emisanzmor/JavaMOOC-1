import java.util.ArrayList;

public class Menu {

  private ArrayList<String> meals;

  public Menu() {
    this.meals = new ArrayList<>();
  }

  public void addMeal(String meal) {
    String mealToLowerCase = meal.toLowerCase();
    boolean mealExists = false;

    for (String mealsIndex : this.meals) {
      if (mealsIndex.toLowerCase().equals(mealToLowerCase)) {
        mealExists = true;
        break;
      }
    }

    if (!mealExists) {
      this.meals.add(meal);
      System.out.println(meal + " is being added.");
    } else {
      System.out.println(meal + ": Meal already added.");
    }
  }

  public void printMeals() {
    System.out.println("\nMeals: ");
    for (String m : this.meals) {
      System.out.println(m);
    }
  }

  public void clearMeal(String meal) {
    String mealsToLowerCase = meal.toLowerCase();
    boolean mealExists = false;

    for (String mealIndex : this.meals) {
      if (mealIndex.toLowerCase().equals(mealsToLowerCase)) {
        mealExists = true;
        this.meals.remove(mealIndex);
        System.out.println(meal + ": Meal removed. ");
        break;
      }
    }

    if (!mealExists) {
      System.out.println("\n" + meal + ": Meal not in list.");
    }
  }

  public void clearMenu() {
    this.meals.clear();
    System.out.println("Menu cleared.");
  }
}
