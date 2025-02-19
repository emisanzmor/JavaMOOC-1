import java.util.ArrayList;

public class GradeRegister {

  private ArrayList<Integer> grades;
  private ArrayList<Integer> gradePoints;

  public GradeRegister() {
    this.grades = new ArrayList<>();
    this.gradePoints = new ArrayList<>();
  }

  public void addGradeBasedOnPoints(int points) {
    this.grades.add(pointsToGrade(points));
    this.gradePoints.add(points);
  }

  private double calcAverage(ArrayList<Integer> list) {
    if (list.isEmpty()) {
      System.out.println("List is empty.");
      return -1;
    }

    double sum = 0;

    for (double i : list) {
      sum += i;
    }

    return sum / list.size();
  }

  public double averageOfPoints() {
    return calcAverage(this.gradePoints);
  }

  public double averageOfGrades() {
    return calcAverage(this.grades);
  }

  public static int pointsToGrade(int points) {
    int grade = 0;
    if (points < 50) {
      grade = 0;
    } else if (points < 60) {
      grade = 1;
    } else if (points < 70) {
      grade = 2;
    } else if (points < 80) {
      grade = 3;
    } else if (points < 90) {
      grade = 4;
    } else {
      grade = 5;
    }

    return grade;
  }
}
