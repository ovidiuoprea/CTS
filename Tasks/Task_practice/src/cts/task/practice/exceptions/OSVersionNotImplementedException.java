package cts.task.practice.exceptions;

public class OSVersionNotImplementedException extends RuntimeException {
    public OSVersionNotImplementedException() {
        super("OS version not yet implemented");
    }
}
