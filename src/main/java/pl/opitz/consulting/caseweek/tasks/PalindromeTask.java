package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.DynamoDB.CatalogItem;
import pl.opitz.consulting.caseweek.DynamoDB.DAO;
import pl.opitz.consulting.caseweek.model.PalindromeTaskRequest;
import pl.opitz.consulting.caseweek.model.PalindromeTaskResponse;

public class PalindromeTask implements Task<PalindromeTaskRequest, PalindromeTaskResponse> {

  @Override
  public PalindromeTaskResponse resolveTask(PalindromeTaskRequest request) {
    String word = request.getWord().toLowerCase();
    DAO d=new DAO();


    int length = word.length();
    for (int i = 0; i < (length / 2); i++) {
      if (word.charAt(i) != word.charAt(length - 1 -i)) {

        d.save(new CatalogItem(request.getTask().toString(),"false"));
        return new PalindromeTaskResponse(false);
      }
    }
      d.save(new CatalogItem(request.getTask().toString(),"true"));
    return new PalindromeTaskResponse(true);
  }
}
