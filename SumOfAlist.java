import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfAlist {
    ArrayList<Integer> numbers =  new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String number;

    public void addToList() {

        while (true) {

            try{

                System.out.println("Enter a number: Press ENTER to STOP");
        number = scanner.nextLine();

        if (number.isEmpty()) {
            System.out.println("Quitting...");
            break;

        }

        

        int numb = Integer.parseInt(number);
        numbers.add(numb);


            } catch (NumberFormatException e){
                System.out.println("Enter a valid number.");
                
            }
             
        }
       
        sumforloop();
        sumforeach();

    }

    public void sumforloop() {
        int sum = 0; 
        for (int i = 0; i<numbers.size(); i++) {
            int pointer = numbers.get(i);

            sum += pointer;
        }

        System.out.println("Sum with \"for loop\": " + sum);
    }

    public void sumforeach() {
        int sum = 0;
        for (int pointer : numbers) {
            sum+= pointer;
        }

        System.out.println("Sum with \"for each\": " + sum);
    }
    
    public static void main(String[] args) {
    
    SumOfAlist sumofa = new SumOfAlist();
    sumofa.addToList();

}

}

