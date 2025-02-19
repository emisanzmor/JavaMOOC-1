public class YourFirstAccount {

  public static void main(String[] args) {
    Account account = new Account("Emiliano", 100);
    account.deposit(20);
    System.out.println(account.toString());

    Account mattew = new Account("Mathews account", 1000);
    Account myAccount = new Account("MyAccount", 0);
    mattew.withdrawal(100);
    myAccount.deposit(100);

    System.out.println(mattew.toString());
    System.out.println(myAccount.toString());
  }
}
