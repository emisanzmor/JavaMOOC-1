public class StackMain {

  public static void main(String[] args) {
    Stack s = new Stack();
    System.out.println("Empty stack? " + s.isEmpty());
    System.out.println(s.values());
    System.out.println();
    s.add("Gelis");
    s.add("Emi");
    s.add("Gelis");
    System.out.println();
    System.out.println("Empty stack? " + s.isEmpty());
    System.out.println(s.values());
    System.out.println();
    System.out.println("Taken: " + s.take());
    System.out.println();
    System.out.println("Values after take(): " + s.values());
  }
}
