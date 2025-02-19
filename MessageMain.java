public class MessageMain {

  public static void main(String[] args) {
    MessagingService messaging = new MessagingService();

    messaging.add(new Message("Emi", "Hola como te llamas."));
    System.out.println(messaging.getMessages());
  }
}
