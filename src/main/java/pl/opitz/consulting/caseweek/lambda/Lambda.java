package pl.opitz.consulting.caseweek.lambda;

import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.amazonaws.services.lambda.model.InvocationType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.apache.log4j.Logger;
import pl.opitz.consulting.caseweek.model.*;
import pl.opitz.consulting.caseweek.tasks.*;

public class Lambda {

  private static final String TEAM_CUSTOM_NAME = "Piatek";

  private static final Logger LOG = Logger.getLogger(Lambda.class);

  private RectangleTask rectangleTask;
  private PalindromeTask palindromeTask;
  private TranslateTask translateTask;
  private PrimeNumberTask primeNumberTask;

  public Lambda() {
    this.rectangleTask = TaskFactory.instance().createRecentagleTask();
    this.palindromeTask = TaskFactory.instance().createPalindromeTask();
    this.translateTask = TaskFactory.instance().createTranslateTask();
    this.primeNumberTask = TaskFactory.instance().createPrieNumberTask();
  }

  @LambdaFunction(invocationType = InvocationType.RequestResponse)
  public Object getRequestAndReturnResponse(LambdaRequest request) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();

    LOG.debug(objectMapper.writeValueAsString(request));

    switch (request.getTask()) {
      case LAMBDA_DEPLOYED:
        return TEAM_CUSTOM_NAME;
      case RECTANGLE_FIELD:
        return rectangleTask.resolveTask(
            objectMapper.readValue(request.getRequestAsJson(), RectangleTaskRequest.class));
      case PALINDROME:
        return palindromeTask.resolveTask(
                objectMapper.readValue(request.getRequestAsJson(), PalindromeTaskRequest.class));
      case TRANSLATE:
        return translateTask.resolveTask(
                objectMapper.readValue(request.getRequestAsJson(), TranslateTaskRequest.class));
        case PRIME_NUMBER:
            return primeNumberTask.resolveTask(
                objectMapper.readValue(request.getRequestAsJson(), PrimeNumberTaskRequest.class));
      default:
        return null;
    }
  }

}
