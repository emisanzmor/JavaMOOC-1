public class Cube {

  int edgeLength;
  int volume;

  public Cube(int edgeLength) {
    this.edgeLength = edgeLength;
    this.volume = volume();
  }

  public int volume() {
    return this.edgeLength * this.edgeLength * this.edgeLength;
  }

  public String toString() {
    return (
      "The length of the edge is " +
      this.edgeLength +
      " and the volume is " +
      this.volume
    );
  }
}
