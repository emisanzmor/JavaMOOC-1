import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

  ArrayList<String> todoList;

  public ToDoList() {
    todoList = new ArrayList<>();
  }

  public void add(String task) {
    if (task.isEmpty()) {
      System.out.println("Input is empty.");
      return;
    }
    this.todoList.add(task);
  }

  public void print() {
    if (todoList.isEmpty()) {
      System.out.println("List is empty.");
    }
    int index = 1;
    for (String i : this.todoList) {
      System.out.println(index + ": " + i);
      index++;
    }
  }

  public void remove(int number) {
    if (todoList.isEmpty()) {
      System.out.println("There are no tasks to remove.");
    }

    if (number > 0 && number <= this.todoList.size()) {
      String removed = this.todoList.remove(number - 1);
      System.out.println("Removed task: " + removed);
    } else {
      System.out.println("Number out of list size.");
    }
  }
}
