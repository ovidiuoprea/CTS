package cts.task3.exceptions;

import cts.task3.models.Kebap;

public class TooManySaucesException extends RuntimeException{
    private static final String TOO_MANY_SAUCES_EXCEPTION_MESSAGE = "Too many sauces! The limit is " + Kebap.SAUCES_COUNT_LIMIT;

    public TooManySaucesException() {
        super(TOO_MANY_SAUCES_EXCEPTION_MESSAGE);
    }
}
