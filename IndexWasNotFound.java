import java.util.Scanner;

public class IndexWasNotFound {

    public static void main (String[] args) {
        int[] myarray = new int[5];
        Scanner scanner = new Scanner(System.in);
        int index = 0;

        while (index < myarray.length ){
            System.out.println("Enter an integer: ");
            myarray[index] = scanner.nextInt();
              System.out.println("Index: " + index + " is " + myarray[index]);

            index++;
        }

        boolean found = false;

        System.out.println("Search for: ");
        int number = scanner.nextInt();
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] == number) {
                
                System.out.println("Number " + number + " is found at index " + i);
                found = true;
                break;
            }    

        }
        
        if (!found) {    
                System.out.println("Number not found in the array.");  
            }
      
            



    }
}







