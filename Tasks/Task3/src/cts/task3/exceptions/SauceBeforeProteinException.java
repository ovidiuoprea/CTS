package cts.task3.exceptions;

public class SauceBeforeProteinException extends RuntimeException{
    private static final String SAUCE_BEFORE_PROTEIN_EXCEPTION_MESSAGE = "Cannot add a sauce before adding protein!";
    public SauceBeforeProteinException() {
        super(SAUCE_BEFORE_PROTEIN_EXCEPTION_MESSAGE);
    }
}
