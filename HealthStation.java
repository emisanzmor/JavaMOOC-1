public class HealthStation {

  int weighingsNum = 0;

  public int weigh(PersonTwo person) {
    weighingsNum += 1;
    return person.getWeight();
  }

  public void feed(PersonTwo person) {
    person.setWeight(person.getWeight() + 1);
  }

  public int weighings(PersonTwo person) {
    return weighingsNum;
  }
}
