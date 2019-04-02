package pl.opitz.consulting.caseweek.model;

public class TranslateTaskResponse extends TaskResponse {

    private String translatedSentance;

    public TranslateTaskResponse() {
        setTask(Task.RECTANGLE_FIELD);
    }

    public TranslateTaskResponse(String translatedSentance) {
        this();
        this.translatedSentance = translatedSentance;
    }

    public String getField() {
        return translatedSentance;
    }

    public void setField(String translatedSentance) {
        this.translatedSentance = translatedSentance;
    }
}
