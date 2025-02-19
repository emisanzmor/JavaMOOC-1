
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "";
        String[] myStrings = new String[4];

        for (int i = 1; i<=3; i++) {
            

            if (i == 1) {
                number = "first ";
            } else if (i == 2) {
                number = "second ";

            } else if (i==3) {
                number = "third ";
            }

            System.out.println("Write the " + number + "string: ");
            myStrings[i] = scanner.nextLine();
            
            }

            

            System.out.println("You wrote: ");
            
            for(int i = 1; i <= 3; i++) {
                System.out.println(myStrings[i]);

    }
}
}