import java.util.Scanner;

public class LiquidContainers {

  int container1;
  int container2;
  int waste;

  public LiquidContainers() {
    this.container1 = 0;
    this.container2 = 0;
    this.waste = 0;
  }

  public void addLiquid(int amount) {
    int spaceContainer1 = 100;
    spaceContainer1 -= this.container1;
    if (amount <= spaceContainer1) {
      this.container1 += amount;
    } else {
      this.container1 = 100;
      this.waste += amount;
    }
  }

  public void moveLiquid(int amount) {
    int spaceContainer2 = 100;
    if (this.container1 >= amount) {
      this.container1 -= amount;
      spaceContainer2 -= this.container2;

      if (amount <= spaceContainer2) {
        this.container2 += amount;
      } else {
        this.container2 = 100;
        this.waste += (amount - spaceContainer2);
      }
    } else {
      this.waste += (amount - this.container1);
      this.container2 += this.container1;
      this.container1 = 0;
    }
  }

  public void removeLiquid(int amount) {
    if (this.container2 >= amount) {
      this.container2 -= amount;
    } else {
      this.container2 = 0;
    }
  }

  public static void main(String[] args) {
    LiquidContainers liquid = new LiquidContainers();
    Scanner scanner = new Scanner(System.in);
    boolean shouldLoop = true;

    while (shouldLoop) {
      System.out.println("First container: " + liquid.container1 + "/100");
      System.out.println("Second container: " + liquid.container2 + "/100");
      System.out.println(
        "Enter an option: \n Add amount \n Move amount \n Remove amount \n Quit amount\n"
      );
      String input = scanner.nextLine();
      String[] split = input.split(" ");

      String command = split[0].toLowerCase();
      if (command.equalsIgnoreCase("quit")) {
        shouldLoop = false;
        break;
      }

      int amount = Integer.parseInt(split[1]);

      String commandLowerCase = command.toLowerCase();

      switch (commandLowerCase) {
        case "add":
          liquid.addLiquid(amount);
          break;
        case "move":
          liquid.moveLiquid(amount);
          break;
        case "remove":
          liquid.removeLiquid(amount);
          break;
        default:
          System.out.println("Invalid command.");
          break;
      }
    }
  }
}
