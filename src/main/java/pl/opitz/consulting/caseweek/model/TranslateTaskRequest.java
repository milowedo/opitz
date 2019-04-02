package pl.opitz.consulting.caseweek.model;

public class TranslateTaskRequest extends TaskRequest {

    String translate;

    public TranslateTaskRequest() {setTask(Task.TRANSLATE);}

    public TranslateTaskRequest(String sentance) {
        this();
        translate = sentance;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}
