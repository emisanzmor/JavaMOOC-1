import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    ArrayList<String> names = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void readInput() {

        while (true) {
             System.out.println("Give me a name (Press ENTER to quit)");
             String name = scanner.nextLine();

             if (name.isEmpty()) {
                System.out.println("Quitting...");
                break;
             }

             names.add(name);
        }

        System.out.println("Total of entries: " + names.size());
        System.out.println("First value read: " + names.getFirst());
        System.out.println("Last read value: " + names.getLast());
       

    }

    public static void main(String[] args) {
    ListSize lists = new ListSize();
    lists.readInput();
}
}

