import java.util.ArrayList;

public class Points {

  private ArrayList<Integer> grades;

  public Points() {
    this.grades = new ArrayList<>();
  }

  public void addPointTotals(int grade) {
    if (grade > 0 && grade <= 100) {
      this.grades.add(grade);
    }
  }

  public double average() {
    double sum = 0;
    double average;

    for (int grade : this.grades) {
      if (grade > 0 && grade <= 100) {
        sum += grade;
      }
    }

    average = sum / grades.size();

    return average;
  }

  public String averagePassing() {
    double sum = 0;
    double average = 0;
    int passingCount = 0;

    for (int grade : this.grades) {
      if (grade > 49) {
        passingCount++;
        sum += grade;
      }
    }

    average = sum / passingCount;

    if (sum == 0) {
      return "-";
    } else {
      return average + " ";
    }
  }

  public double passPercentage() {
    int passingCount = 0;
    double passPercentage = 0;

    for (int grade : this.grades) {
      if (grade > 49) {
        passingCount++;
      }
    }

    passPercentage = (100 * passingCount) / this.grades.size();

    return passPercentage;
  }

  public void gradeDistribution() {
    int[] gradeDistribution = new int[6];
    for (int grade : this.grades) {
      if (grade > 0 && grade <= 50) {
        gradeDistribution[5]++;
      } else if (grade > 50 && grade <= 60) {
        gradeDistribution[4]++;
      } else if (grade > 60 && grade <= 70) {
        gradeDistribution[3]++;
      } else if (grade > 70 && grade <= 80) {
        gradeDistribution[2]++;
      } else if (grade > 80 && grade < 90) {
        gradeDistribution[1]++;
      } else if (grade >= 90) {
        gradeDistribution[0]++;
      }
    }
    System.out.println("Grade distribution: ");
    int gradeIndex = 5;
    for (int e : gradeDistribution) {
      System.out.print(gradeIndex + ":");

      for (int i = 0; i < e; i++) {
        System.out.print("*");
      }

      System.out.println();
      gradeIndex--;
    }
  }
}
