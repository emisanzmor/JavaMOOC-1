import java.util.ArrayList;

public class MessagingService {

  ArrayList<Message> list;

  public MessagingService() {
    this.list = new ArrayList<>();
  }

  public void add(Message message) {
    String mes = message.getContent();
    if (mes.length() <= 280) {
      this.list.add(message);
    }
  }

  public ArrayList<Message> getMessages() {
    return this.list;
  }
}
