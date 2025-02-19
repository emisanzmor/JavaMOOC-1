public class Fitbyte {

  private int age;
  private int restingHeartRate;
  private double percentage = 0.5;

  public Fitbyte(int age, int restingHeartRate) {
    this.age = age;
    this.restingHeartRate = restingHeartRate;
  }

  public double targetHeartRate(double maximumHeartRate) {
    return 206.3 - (0.711 * this.age);
  }

  public int getAge() {
    return this.age;
  }

  public int getRestingHeartRate() {
    return this.restingHeartRate;
  }

  public double getPercentage() {
    return this.percentage * 100;
  }
}
