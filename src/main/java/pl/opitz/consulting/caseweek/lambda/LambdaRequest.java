package pl.opitz.consulting.caseweek.lambda;

import pl.opitz.consulting.caseweek.model.Task;

public class LambdaRequest {

  private Task task;

  private String requestAsJson;

  public LambdaRequest() {
  }

  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

  public String getRequestAsJson() {
    return requestAsJson;
  }

  public void setRequestAsJson(String requestAsJson) {
    this.requestAsJson = requestAsJson;
  }
}
