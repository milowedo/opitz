package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.model.RectangleTaskRequest;
import pl.opitz.consulting.caseweek.model.RectangleTaskResponse;

public class RectangleTask implements Task<RectangleTaskRequest, RectangleTaskResponse> {

  @Override
  public RectangleTaskResponse resolveTask(RectangleTaskRequest request) {
    return new RectangleTaskResponse(request.getLength().multiply(request.getWidth()));
  }
}
