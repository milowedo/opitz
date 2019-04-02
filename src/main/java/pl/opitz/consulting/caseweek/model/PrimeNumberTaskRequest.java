package pl.opitz.consulting.caseweek.model;

public class PrimeNumberTaskRequest extends TaskRequest{

    private int number;

    public PrimeNumberTaskRequest() {
        this.setTask(Task.PRIME_NUMBER);
    }

    public PrimeNumberTaskRequest(int n) {
        this();
        this.number = n;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int n) {
        this.number = n;
    }


}
