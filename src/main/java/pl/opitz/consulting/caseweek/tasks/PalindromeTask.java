package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.model.PalindromeTaskRequest;
import pl.opitz.consulting.caseweek.model.PalindromeTaskResponse;

public class PalindromeTask implements Task<PalindromeTaskRequest, PalindromeTaskResponse> {

  @Override
  public PalindromeTaskResponse resolveTask(PalindromeTaskRequest request) {
    String word = request.getWord().toLowerCase();
    int length = word.length();
    for (int i = 0; i < (length / 2); i++) {
      if (word.charAt(i) != word.charAt(length - 1 -i)) {
        return new PalindromeTaskResponse(false);
      }
    }
    return new PalindromeTaskResponse(true);
  }
}
