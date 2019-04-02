package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.model.TranslateTaskRequest;
import pl.opitz.consulting.caseweek.model.TranslateTaskResponse;
import com.amazonaws.services.translate.AmazonTranslate;
import com.amazonaws.services.translate.AmazonTranslateClient;
import com.amazonaws.services.translate.model.TranslateTextRequest;
import com.amazonaws.services.translate.model.TranslateTextResult;

public class TranslateTask implements Task<TranslateTaskRequest, TranslateTaskResponse> {

    @Override
    public TranslateTaskResponse resolveTask(TranslateTaskRequest request) {

        AmazonTranslate translate = AmazonTranslateClient.builder().build();

        TranslateTextRequest translateRequest = new TranslateTextRequest()
                .withText(request.getTranslate())
                .withSourceLanguageCode("de")
                .withTargetLanguageCode("es");
        TranslateTextResult result  = translate.translateText(translateRequest);

        return new TranslateTaskResponse(result.getTranslatedText());
    }
}
