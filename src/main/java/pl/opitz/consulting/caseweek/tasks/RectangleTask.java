package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.DynamoDB.CatalogItem;
import pl.opitz.consulting.caseweek.DynamoDB.DAO;
import pl.opitz.consulting.caseweek.model.RectangleTaskRequest;
import pl.opitz.consulting.caseweek.model.RectangleTaskResponse;

public class RectangleTask implements Task<RectangleTaskRequest, RectangleTaskResponse> {

  @Override
  public RectangleTaskResponse resolveTask(RectangleTaskRequest request) {
    DAO d=new DAO();
    d.save(new CatalogItem(request.getTask().toString(),(request.getLength().multiply(request.getWidth())).toString()));
    return new RectangleTaskResponse(request.getLength().multiply(request.getWidth()));
  }
}
