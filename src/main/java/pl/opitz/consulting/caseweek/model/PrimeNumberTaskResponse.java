package pl.opitz.consulting.caseweek.model;

public class PrimeNumberTaskResponse extends TaskResponse{

    private boolean primeNumber;

    public PrimeNumberTaskResponse() {
        this.setTask(Task.PRIME_NUMBER);
    }

    public PrimeNumberTaskResponse(boolean n) {
        this();
        this.primeNumber = n;
    }

    public boolean getPrime() {
        return primeNumber;
    }

    public void setPrime(boolean p) {
        this.primeNumber = p;
    }
}
