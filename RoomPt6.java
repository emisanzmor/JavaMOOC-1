import java.util.ArrayList;

public class RoomPt6 {

  private ArrayList<PersonPt6> persons;

  public RoomPt6() {
    this.persons = new ArrayList<>();
  }

  public void add(PersonPt6 person) {
    this.persons.add(person);
  }

  public boolean isEmpty() {
    if (persons.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public ArrayList<PersonPt6> getPersons() {
    return this.persons;
  }

  public PersonPt6 shortest() {
    PersonPt6 shortestPerson = persons.get(0);

    if (persons.isEmpty()) {
      return null;
    } else {
      for (PersonPt6 p : this.persons) {
        if (shortestPerson.getHeight() > p.getHeight()) {
          shortestPerson = p;
        }
      }
    }
    return shortestPerson;
  }

  public PersonPt6 take() { // Removes the shortest person in the room.
    PersonPt6 shortestPerson = shortest();

    if (persons.isEmpty()) {
      return null;
    } else {
      persons.remove(shortestPerson);
    }

    return shortestPerson;
  }
}
