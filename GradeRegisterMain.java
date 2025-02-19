import java.util.Scanner;

public class GradeRegisterMain {

  public static void main(String[] args) {
    GradeRegister grade = new GradeRegister();
    Scanner scanner = new Scanner(System.in);

    GradeRegisterMenu gradeMenu = new GradeRegisterMenu(scanner, grade);
    gradeMenu.menu();
  }
}
