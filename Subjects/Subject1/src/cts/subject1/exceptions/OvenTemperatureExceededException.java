package cts.subject1.exceptions;

public class OvenTemperatureExceededException extends RuntimeException{
    public OvenTemperatureExceededException() {
        super("Oven Temperature Exceeded");
    }
}
