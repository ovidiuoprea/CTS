package cts.task.practice.exceptions;

public class FeatureNotSupportedException extends RuntimeException{
    public FeatureNotSupportedException() {
        super("Selected feature is not yet supported.");
    }
}
