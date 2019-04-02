package pl.opitz.consulting.caseweek.model;

public class PalindromeTaskResponse extends TaskResponse {

  private Boolean palindrome;

  public PalindromeTaskResponse() {
    this.setTask(Task.PALINDROME);
  }

  public PalindromeTaskResponse(Boolean palindrome) {
    this();
    this.palindrome = palindrome;
  }

  public Boolean getPalindrome() {
    return palindrome;
  }

  public void setPalindrome(Boolean palindrome) {
    this.palindrome = palindrome;
  }
}
