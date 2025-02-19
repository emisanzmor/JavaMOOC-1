import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    ArrayList<String> names = new ArrayList<>(); //Se crea el ArrayList names.
    Scanner scanner = new Scanner(System.in);
    

    public void addToArray() {


        while (true) { // Mientras la condición booleana del while es true, nos pedirá ingresar un input de nombre.
            System.out.println("Enter a name: (Press ENTER to stop)");
            String input = scanner.nextLine();

            if (input.isEmpty()){ // Si el input está vacío, se sale del ciclo while.
                System.out.println("Empty String. Quitting...");
                break;
        } 

            names.add(input); // Se añaden los input ingresados que no están vacios, por eso se encuentra aquí el .add
                              // después de la condición if.



    }

    
        

    if (!names.isEmpty()) { // Condición if de en caso de que el ArrayList no esté vacío, despliegue el 
                            // primer nombre ingresado en el index 0.

        System.out.println("The first entered name was: " + names.get(0));

    } else { // En caso de que el Array esté vacío, muestra el siguiente mensaje.
        
        System.out.println("No names were entered.");
        
    }

}

    public static void main(String[] args) { // Método main.
        ThirdElement thirdE = new ThirdElement();
        
        thirdE.addToArray();
    }
    
}
