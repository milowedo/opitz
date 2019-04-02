package pl.opitz.consulting.caseweek.model;

public abstract class TaskResponse {

  private Task task;

  public TaskResponse() {
  }

  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }
}
