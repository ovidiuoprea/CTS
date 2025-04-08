package exceptions;

public class VehicleSensorNotFound extends RuntimeException{
    public VehicleSensorNotFound() {
        super("Vehicle sensor not found");
    }
}
