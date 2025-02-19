
import java.util.Scanner;

public class Story {

    Scanner scanner = new Scanner(System.in);
    String[] characters = new String[5];
    String[] jobs = new String[5];

    public void askCharacter(int i) {
        System.out.println("What is the main character called? ");
        characters[i] = scanner.nextLine();
        scanner.nextLine();
    }

    public void askJob(int i) {
        System.out.println("What is their job?");
        jobs[i] = scanner.nextLine();
            }

    public void story() {
        
        System.out.println("Choose a number from 0 to 4: ");
        int i = scanner.nextInt();
        scanner.nextLine();

        if (i < 0 || i >= characters.length) {
            System.out.println("Invalid character. Try again from 0 to 4.");
            return;
        }

        askCharacter(i);
        askJob(i);

        System.out.println("Here is the story: ");
        System.out.println("...");
        System.out.println("....");
        System.out.println(".....");
        System.out.println("Once upon a time there was " + characters[i] + " who was a " + jobs[i]);
        System.out.println("On the way to work, " + characters[i] + " reflected on life.");
        System.out.println("Perhaps " + characters[i] + " will not be a " + jobs[i] + " forever.");


    }

    


    public static void main(String[] args) {

        Story story = new Story();
        story.story();

    }
}
