public class SumOfArray {

    public static int sumOfNumberInArray(int[] myarray) {
       int sum = myarray[0] + myarray[1];

       return sum;

    }

    public static void main (String[] args) {
        int[] array = new int[2];
        array[0] = 5;
        array[1] = 6;
       System.out.println(sumOfNumberInArray(array));
    }
    
}
