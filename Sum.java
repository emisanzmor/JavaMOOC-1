import java.util.ArrayList;

public class Sum {
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            
            sum += number;
        }

        return sum;

    }

    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.removeLast();
        System.out.println("La suma es: " + sum(numbers));
    }
}
