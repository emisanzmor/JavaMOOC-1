import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        int[] myarray = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give two indices to swap. \n ");
        System.out.println("Give me the first integer: ");
        myarray[0] = scanner.nextInt();
        System.out.println("Give me the second integer: ");
        myarray[1] = scanner.nextInt();

        int helper = myarray[0];
        myarray[0] = myarray[1];
        myarray[1] = helper;

        System.out.println("First integer: " + myarray[0] + " , " +  "Second integer: " + myarray[1]);
        
    }
    
}
