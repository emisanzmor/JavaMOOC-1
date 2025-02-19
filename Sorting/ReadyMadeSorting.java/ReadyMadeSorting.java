import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReadyMadeSorting {

  public static void sort(int[] array) {
    Arrays.sort(array);
  }

  public static void sort(String[] array) {
    Arrays.sort(array);
  }

  public static void sortIntegers(ArrayList<Integer> integers) {
    Collections.sort(integers);
  }

  public static void sortStrings(ArrayList<String> strings) {
    Collections.sort(strings);
  }

  public static void main(String[] args) {
    //Array de Integers
    int[] numbers = { 6, 4, 3, 6, 8, 2, 5 };
    sort(numbers);
    System.out.println(Arrays.toString(numbers));
    //Array de Strings
    String[] strings = { "Emi", "Felipe", "Ari", "Gelis", "Fer" };
    sort(strings);
    System.out.println(Arrays.toString(strings));

    //ArrayList de Integers
    ArrayList<Integer> numbersList = new ArrayList<>(); // Creamos el ArrayList
    numbersList.add(3);
    numbersList.add(6);
    numbersList.add(9);
    numbersList.add(2);
    // Llamamos al método sortIntegers que definimos previamente en la clase
    sortIntegers(numbersList);

    for (int i : numbersList) { //Iteramos en el ArrayList para obtener el ArrayList ya organizado.
      System.out.println(i);
    }

    //ArrayList de Strings
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("Sword");
    stringList.add("Pickaxe");
    stringList.add("Helmet");
    stringList.add("Hammer");
    System.out.println("Lista de strings sin ordenar: ");
    for (String i : stringList) {
      System.out.println(i);
    }
    System.out.println();
    sortStrings(stringList);

    System.out.println("Lista de strings ordenada con método Sort: ");
    for (String i : stringList) {
      System.out.println(i);
    }
  }
}
