import java.util.Scanner;

public class BurgerApp {

    Scanner sc = new Scanner(System.in);
    

    public void giftCardCalc() {
        System.out.println("What's your customer number?");
        int customerNumber = Integer.parseInt(sc.nextLine());

        if (customerNumber % 2000 == 0) {
            System.out.println("You get the larger giftcard !");

        } else if (customerNumber >= 1000 && customerNumber % 25 == 0) {
            System.out.println("You get a giftcard !");
        } else {
            System.out.println("You get no giftcard :(");
        }

        
    }
    
    public static void main(String[] args) {

        BurgerApp burgerApp = new BurgerApp();

        burgerApp.giftCardCalc();

        
    }
}
