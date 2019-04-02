package pl.opitz.consulting.caseweek.model;

public abstract class TaskRequest {

  private Task task;

  public TaskRequest() {
  }

  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }
}
