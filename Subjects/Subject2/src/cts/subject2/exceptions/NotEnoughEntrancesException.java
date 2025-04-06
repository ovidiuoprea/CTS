package cts.subject2.exceptions;

public class NotEnoughEntrancesException extends RuntimeException{
    public NotEnoughEntrancesException() {
        super("Not enough entrances for the requested area!");
    }
}
