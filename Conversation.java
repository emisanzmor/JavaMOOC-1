
import javax.swing.*;

public class Conversation {


    public String askQuestion(String question) {
        return JOptionPane.showInputDialog(question);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void startConvo() {
        String reply = askQuestion("Greetings! How are you doing?");
        if (reply == null || reply.isEmpty()) {
            showMessage("No response given");
        }
        String reply2 = askQuestion("Oh, how interesting. Tell me more!");
         if (reply2 == null || reply2.isEmpty()) {
            showMessage("No response given");
        }
        showMessage("Thanks for sharing!");

        showMessage("Your replies were: " + reply + ", " + reply2);

    }

    public static void main(String[] args) {

       Conversation convo = new Conversation();
       convo.startConvo();

        
        
    }}