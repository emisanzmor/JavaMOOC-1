import java.util.Scanner;

public class ContainerMain {

  public static void main(String[] args) {
    Container container = new Container();
    Scanner scanner = new Scanner(System.in);
    ContainerUI containerUI = new ContainerUI(container, scanner);

    containerUI.mainMenu();
  }
}
