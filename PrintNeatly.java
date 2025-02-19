public class PrintNeatly {

  public static void printNeatly(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);

      if (i < array.length - 1) {
        System.out.print(", ");
      } else {
        System.out.println(" ");
      }
    }
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };

    printNeatly(array);
  }
}
