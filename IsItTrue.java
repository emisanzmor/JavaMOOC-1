import java.util.Scanner;

public class IsItTrue {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {

            System.out.println("Give a string");
            String string = scanner.nextLine();


             if (string.equals("true")) {
            System.out.println("You got it right !");
            break;
        } else {
            System.out.println("Try again");
        }

        }
       
    }
}
