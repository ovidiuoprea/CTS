package cts.subject1.exceptions;

public class OvenCountLimitExceededException extends RuntimeException{
    public OvenCountLimitExceededException() {
        super("Oven Count Limit Exceeded");
    }
}
