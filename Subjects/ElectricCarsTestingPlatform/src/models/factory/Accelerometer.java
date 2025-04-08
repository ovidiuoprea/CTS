package models.factory;

public class Accelerometer extends AVehicleSensor {
    public static final String ACCELEROMETER_UNIT = "m/s^2";

    Accelerometer(double sensorValue) {
        super(sensorValue, ACCELEROMETER_UNIT);
    }

    @Override
    public double readSensorValue() {
        return super.readSensorValue();
    }

    @Override
    public String getUnit() {
        return super.getUnit();
    }
}
