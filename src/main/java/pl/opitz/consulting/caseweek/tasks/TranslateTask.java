package pl.opitz.consulting.caseweek.tasks;

import com.amazonaws.auth.*;
import pl.opitz.consulting.caseweek.model.TranslateTaskRequest;
import pl.opitz.consulting.caseweek.model.TranslateTaskResponse;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.*;

import static com.amazonaws.auth.profile.internal.ProfileKeyConstants.REGION;

public class TranslateTask implements Task<TranslateTaskRequest, TranslateTaskResponse> {

    @Override
    public TranslateTaskResponse resolveTask(TranslateTaskRequest request) {

        AmazonTranslate translate = AmazonTranslateClient.builder().build();

        TranslateTextRequest translateRequest = new TranslateTextRequest()
                .withText(request.getSentanceToTranslate())
                .withSourceLanguageCode("de")
                .withTargetLanguageCode("es");
        TranslateTextResult result  = translate.translateText(translateRequest);

        return TranslateTaskResponse(result);
    }
}
