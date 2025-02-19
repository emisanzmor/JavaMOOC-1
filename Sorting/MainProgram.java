public class MainProgram {

  public static int[] smallest(int[] array) {
    int smallestInt = array[0];
    int smallestIndex = 0;
    int index = 0;
    for (int i : array) {
      if (i < smallestInt) {
        smallestInt = i;
        smallestIndex = index;
      }
      index++;
    }
    return new int[] { smallestInt, smallestIndex };
  }

  public static int[] indexOfSmallestFrom(int[] table, int startIndex) {
    int min = table[startIndex];
    int index = 0;

    for (int i = startIndex; i < table.length; i++) {
      if (table[i] <= min) {
        min = table[i];
        index = i;
      }
    }
    return new int[] { index, min };
  }

  public static void swap(int[] array, int index1, int index2) {
    int swap = array[index1];
    array[index1] = array[index2];
    array[index2] = swap;

    System.out.println(
      "Swapped numbers: " + array[index1] + " " + array[index2]
    );
  }

  public static void main(String[] args) {
    int[] myArray = { 3, 5, 7, 9, 2, 8, 4 };
    int[] result = smallest(myArray);
    int[] smallestFromResult = indexOfSmallestFrom(myArray, 5);

    System.out.println("The smallest number is: " + result[0]);
    System.out.println("Index is: " + result[1]);
    System.out.println(
      "Index of smallest " +
      smallestFromResult[0] +
      " value: " +
      smallestFromResult[1]
    );

    //Se muestra el arreglo como fue ingresado por el usuario:
    System.out.print("Array before swapping: {");
    for (int i = 0; i < myArray.length; i++) {
      if (i > 0) {
        System.out.print(", ");
      }
      System.out.print(myArray[i]);
    }

    System.out.println("}");

    //Se hace el swap de los números en los index 1 y 0:
    swap(myArray, 1, 0);
    //Se muestra el array después del swap:
    System.out.print("Array after swapping: {");
    for (int i = 0; i < myArray.length; i++) {
      if (i > 0) {
        System.out.print(", ");
      }
      System.out.print(myArray[i]);
    }
    System.out.println("}");
  }
}
