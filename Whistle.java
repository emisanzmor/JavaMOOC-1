public class Whistle {

  private String sound; //Variable sound : String

  public Whistle(String whistleSound) { //Constructor Whistle con parametro whistleSound
    this.sound = whistleSound;
  }

  public void sound() {
    System.out.println(this.sound);
  }
}
