import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void printNumbersInRange() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ingreso de números
        while (true) {
            System.out.println("Enter a number: (Enter -1 to Stop)");
            String number = scanner.nextLine();

            if (number.equals("-1")) {
                System.out.println("Quitting...");
                break;
            }

            try {
                int numb = Integer.parseInt(number);
                numbers.add(numb);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            }
        }

        while (true) {
// Preguntar si se desea buscar dentro de un rango
        System.out.println("Do you want to search numbers in range? (y/n)");
        String searchinrange = scanner.nextLine();

        if (searchinrange.equalsIgnoreCase("y")) {
            // Leer los límites del rango
            System.out.println("Enter lower limit: ");
            int lowerLimit = scanner.nextInt();

            System.out.println("Enter upper limit: ");
            int upperLimit = scanner.nextInt();

            // Limpiar el buffer después de nextInt()
            scanner.nextLine();  // Esto consume el salto de línea (\n)

            System.out.println("Numbers in range [" + lowerLimit + ", " + upperLimit + "]:");
            for (int number : numbers) {
                if (number >= lowerLimit && number <= upperLimit) {
                
                System.out.println(number);
                   
                }
                
            } break; 
            
            
        } else if (searchinrange.equalsIgnoreCase("n")) {
            System.out.println("Quitting...");
        } else {
            System.out.println("Enter a valid response (y/n).");
        }

        
        }
        
    }

    public static void main(String[] args) {
        PrintInRange printR = new PrintInRange();
        printR.printNumbersInRange();
    }
}
