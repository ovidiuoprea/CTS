package models.factory;

import interfaces.VehicleSensor;

public class AVehicleSensor implements VehicleSensor {
    double sensorValue;
    String unit;

    protected AVehicleSensor(double sensorValue, String unit) {
        this.sensorValue = sensorValue;
        this.unit = unit;
    }

    @Override
    public double readSensorValue() {
        return sensorValue;
    }

    @Override
    public String getUnit() {
        return unit;
    }
}
