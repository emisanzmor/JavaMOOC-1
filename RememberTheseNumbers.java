import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void readNumbers() {
        while (true) {
            System.out.println("Give me a number (Enter -1 to STOP)");
            String number = scanner.nextLine();

        if (number.equals("-1")) {
            System.out.println("Quitting...");
            break;
        }

        try { int numb = Integer.parseInt(number); // Intenta convertir el input en String que di a un número Integer, en caso de que
                                                   // se haya ingresado un String de letras al querer convertirlo lanza el error 
                                                   // NumberFormatException, por lo que este try-catch evita que el programa termine y lanza el mensaje
                                                   // "Please enter a valid number" sin terminar el ciclo while. 
        numbers.add(numb);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }

        }

        System.out.println("You entered these numbers: ");

        for (int i = 0; i < numbers.size() ; i++) { // Ciclo For itera en la lista de elementos de "numbers", numbers.size() da el numero de
                                                    // elementos que hay en el ArrayList, e "i" itera empezando desde 0 hasta
                                                    // un número menos del tamaño del Array. Si el Array tiene 5 elementos el "i" itera de 0 a 4.
                                                    // Evitando el error de IndexOutOfBoundsException
            System.out.println(numbers.get(i));
    
        }



    
}

public static void main(String[] args) {
    RememberTheseNumbers remember = new RememberTheseNumbers();
    remember.readNumbers();
}
 
}