package pl.opitz.consulting.caseweek.tasks;

import org.apache.log4j.Logger;
import pl.opitz.consulting.caseweek.model.TaskRequest;
import pl.opitz.consulting.caseweek.model.TaskResponse;

public interface Task<T extends TaskRequest, S extends TaskResponse> {

  Logger LOG = Logger.getLogger(Task.class);

  S resolveTask(T request);
}
