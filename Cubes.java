import java.math.*;

public class Cubes {

  private double input;

  public Cubes(double input) {
    this.input = input;
  }

  public double getCube() {
    return Math.pow(this.input, 3);
  }
}
