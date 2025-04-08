package models.factory;

public class EngineTemperatureSensor extends AVehicleSensor {
    public static final String ENGINE_TEMPERATURE_UNIT = "C";
    EngineTemperatureSensor(double sensorValue) {
        super(sensorValue, ENGINE_TEMPERATURE_UNIT);
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
