import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String number;
 
    public void setList() {
        while (true) {
            
            try {
                System.out.println("Enter a number: (Press ENTER to stop)");
            number = scanner.nextLine();

            if (number.isEmpty()) {
                System.out.println("Quitting...");
                break;
            }

            int numb = Integer.parseInt(number);
            numbers.add(numb);

            

            } catch(NumberFormatException e){ 
                System.out.println("Enter a valid number.");
            }
            
        }

        if (numbers.size() > 0){
            average();
        } else {
            System.out.println("No numbers entered. Cannot calculate average.");
        }
    }

    public void average() {
        double sum = 0;

        for (int pointer : numbers) {
            sum += pointer;
        }

        double average = sum / numbers.size();

        System.out.printf("Average is: %.2f%n", average); 
        searchFor();
    }

    public void searchFor() {
        System.out.println("Do you want to search a number? (y/n) ");
        String askif = scanner.nextLine();

        while(true) {
            
                if (askif.equalsIgnoreCase("y")) {
             System.out.println("Search for: ");
        String searchfor = scanner.nextLine();

                

        

try {
    int number = Integer.parseInt(searchfor);
    if (numbers.contains(number)) {
            System.out.println("Number " + number + " was found at " + numbers.indexOf(number));
            break;
        } else {
            System.out.println("Number " + number + " was not found");
        }
        break; 
    } catch (NumberFormatException e) {
        System.out.println("Enter a valid number.");


        
        
    } } else if (askif.equalsIgnoreCase("n")){
            System.out.println("Quitting...");
            break;
        } else {
            System.out.println("Enter a valid response. 'y' for yes or 'n' for no");
            askif = scanner.nextLine();
            
}

        
        }}
            
            
       
     public static void main(String[] args) {
        AverageOfAList averageofa = new AverageOfAList();
        averageofa.setList();
    }

    
    }
   
