package cts.task.practice.exceptions;

public class OSVersionNotImplementedException extends RuntimeException {
    public OSVersionNotImplementedException(int version) {
        super("OS version " + version + " not yet implemented");
    }
}
