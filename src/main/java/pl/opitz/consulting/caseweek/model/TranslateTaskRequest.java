package pl.opitz.consulting.caseweek.model;

public class TranslateTaskRequest extends TaskRequest {

    String sentanceToTranslate;

    public TranslateTaskRequest() {setTask(Task.TRANSLATE);}

    public TranslateTaskRequest(String sentance) {
        this();
        sentanceToTranslate = sentance;
    }

    public String getSentanceToTranslate() {
        return sentanceToTranslate;
    }
}
