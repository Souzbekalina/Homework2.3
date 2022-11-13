package Hm3;

public class LimitException extends Exception{
    private Double remainingAmount;

    public LimitException(String message, double amount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }
}
