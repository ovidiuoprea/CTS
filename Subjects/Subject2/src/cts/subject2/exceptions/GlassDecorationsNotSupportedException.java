package cts.subject2.exceptions;

public class GlassDecorationsNotSupportedException extends RuntimeException {
    public GlassDecorationsNotSupportedException() {
        super("Cannot add glass decorations to a store with soft flooring!");
    }
}
