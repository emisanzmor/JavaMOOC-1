public class RoomPt6Main {

  public static void main(String[] args) {
    RoomPt6 room = new RoomPt6();
    System.out.println("Empty room? " + room.isEmpty());
    System.out.println();
    room.add(new PersonPt6("Emi", 170));
    room.add(new PersonPt6("Monica", 160));
    for (PersonPt6 person : room.getPersons()) {
      System.out.println(person);
    }
    System.out.println();
    System.out.println("Empty room? " + room.isEmpty());
    System.out.println("Shortest: " + room.shortest());
    System.out.println("Removing: " + room.take());
    System.out.println("Remaining now : " + room.getPersons());
  }
}
