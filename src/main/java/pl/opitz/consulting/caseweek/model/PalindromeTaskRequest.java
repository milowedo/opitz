package pl.opitz.consulting.caseweek.model;

public class PalindromeTaskRequest extends TaskRequest {

  private String word;

  public PalindromeTaskRequest() {
    setTask(Task.PALINDROME);
  }

  public PalindromeTaskRequest(String word) {
    this();
    this.word = word;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }
}
