public class ExerciseMain {

  public static void main(String[] args) {
    // Crear una instancia de ExerciseManagement
    ExerciseManagement exerciseManagement = new ExerciseManagement();

    // Agregar algunos ejercicios
    exerciseManagement.add("Push-ups");
    exerciseManagement.add("Squats");
    exerciseManagement.add("Running");

    // Mostrar la lista de ejercicios
    System.out.println("Lista de ejercicios:");
    for (String exercise : exerciseManagement.exerciseList()) {
      System.out.println(exercise);
    }

    // Marcar un ejercicio como completado
    Exercise pushups = new Exercise("Push-ups");
    pushups.setCompleted(true);

    // Verificar si un ejercicio está completado
    System.out.println(
      "\n¿Está completado el ejercicio 'Push-ups'? " +
      exerciseManagement.isCompleted("Push-ups")
    );
    System.out.println(
      "¿Está completado el ejercicio 'Squats'? " +
      exerciseManagement.isCompleted("Squats")
    );
    System.out.println(
      "¿Está completado el ejercicio 'Running'? " +
      exerciseManagement.isCompleted("Running")
    );
  }
}
