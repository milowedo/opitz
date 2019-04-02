package pl.opitz.consulting.caseweek.tasks;

import org.apache.log4j.Logger;

public class TaskFactory {

  private static TaskFactory INSTANCE;
  private static final Logger LOG = Logger.getLogger(TaskFactory.class);

  private TaskFactory() {
  }

  public static TaskFactory instance() {
    if (INSTANCE == null) {
      INSTANCE = new TaskFactory();
    }
    return INSTANCE;
  }

  public RectangleTask createRecentagleTask() {
    return new RectangleTask();
  }

  public PalindromeTask createPalindromeTask() {
    return new PalindromeTask();
  }
}
