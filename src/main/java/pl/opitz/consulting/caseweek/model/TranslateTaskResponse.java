package pl.opitz.consulting.caseweek.model;

public class TranslateTaskResponse extends TaskResponse {

    private String translate;

    public TranslateTaskResponse() {
        setTask(Task.TRANSLATE);
    }

    public TranslateTaskResponse(String translatedSentance) {
        this();
        this.translate = translatedSentance;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}
