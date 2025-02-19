public class HealthStationMain {

  public static void main(String[] args) {
    HealthStation childrenHospital = new HealthStation();
    PersonTwo ethan = new PersonTwo("Ethan", 1, 110, 7);
    PersonTwo peter = new PersonTwo("Peter", 33, 176, 85);

    System.out.println(
      ethan.getName() + "'s weight: " + childrenHospital.weigh(ethan) + " kilos"
    );

    System.out.println(
      peter.getName() + "'s weight: " + childrenHospital.weigh(peter) + " kilos"
    );

    childrenHospital.feed(ethan);
    childrenHospital.feed(ethan);

    System.out.println(
      ethan.getName() + "'s weight: " + childrenHospital.weigh(ethan) + " kilos"
    );

    System.out.println(
      ethan.getName() +
      " and " +
      peter.getName() +
      " had been weigh " +
      childrenHospital.weighings(ethan) +
      " times."
    );
  }
}
