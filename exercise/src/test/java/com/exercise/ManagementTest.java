import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ManagementTest {

  @Test
  void exerciseListEmptyAtBeginning() {
    ExerciseManagement management = new ExerciseManagement();

    assertEquals(0, management.exerciseList().size());
  }
}
