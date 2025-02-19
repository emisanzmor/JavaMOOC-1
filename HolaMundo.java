import java.util.*;

public class HolaMundo {
    Scanner sc = new Scanner(System.in);
    String hola = "";

public void DiHola() {

    System.out.println("Di Hola: ");
    hola = sc.nextLine();
    
    System.out.println(hola); 
}

public static void main (String[] args) {
    HolaMundo HolaM = new HolaMundo();
    HolaM.DiHola();
}
}
 