import java.util.ArrayList;

public class ExerciseManagement {

  private ArrayList<Exercise> exercises;

  public ExerciseManagement() {
    this.exercises = new ArrayList<>();
  }

  public ArrayList<String> exerciseList() {
    ArrayList<String> list = new ArrayList<>();

    for (Exercise e : this.exercises) {
      list.add(e.getName());
    }

    return list;
  }

  public void add(String exercise) {
    this.exercises.add(new Exercise(exercise));
  }

  public boolean isCompleted(String exercise) {
    for (Exercise e : this.exercises) {
      if (e.getName().equals(exercise)) {
        return e.isCompleted();
      }
    }
    return false;
  }
}
