public class AgentMain {

  public static void main(String[] args) {
    Agent agent = new Agent("James", "Bond");
    System.out.println(agent.toString());

    Agent emi = new Agent("Emi", "Sanzmor");
    System.out.println(emi.toString());
  }
}
