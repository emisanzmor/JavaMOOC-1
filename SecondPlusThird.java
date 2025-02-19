import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void ReadIntegers() {
        while (true) {
            System.out.println("\nEnter a number: (Press ENTER to quit)");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Empty entry. Quitting...");
                break;
            }

            try {
                Integer number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                    System.err.println("\nInvalid input. Please enter an Integer number.");
                }
    } 

        if (!numbers.isEmpty()) {
            System.out.println("\nThe first entry was: " + numbers.get(0));

        
        if (numbers.size() > 1) {
            System.out.println("\nThe second entry was: " + numbers.get(1));

        }

        if (numbers.size() > 2) {
            System.out.println("\nThe third entry was: " + numbers.get(2));
            
        

             while (true) {
                System.out.println("\nDo you want to sum second and third inputs? y/n");
                String sumornot = sc.nextLine();

                if (sumornot.equalsIgnoreCase("y")) {
                System.out.println("Your sum is: " + sum());
                break;

            } else if (sumornot.equalsIgnoreCase("n")) {

                System.out.println("Quitting...");
                break;

            } else {
                System.out.println("\nEntry not valid. Please enter 'y' or 'n' ");
            }

            }
           

        } else {
            System.out.println("Not enough values were entered to perform sum.");
        }
            
        } else {
            System.out.println("\nNo values were entered.");
        }


        
    }


    public int sum() {
        return (numbers.get(1) + numbers.get(2));
    }


    public static void main (String[] args) {

        SecondPlusThird secPT = new SecondPlusThird();
        secPT.ReadIntegers();

    }
    
}
