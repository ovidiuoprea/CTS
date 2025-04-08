package models.factory;

import enums.VehicleSensorType;
import exceptions.VehicleSensorNotFound;
import interfaces.IVehicleSensorFactory;

public class VehicleSensorFactory implements IVehicleSensorFactory {
    @Override
    public AVehicleSensor getVehicleSensor(VehicleSensorType vehicleSensorType, double sensorValue) {
        switch (vehicleSensorType) {
            case VehicleSensorType.ACCELEROMETER:
                return new Accelerometer(sensorValue);
            case VehicleSensorType.BATTERY_TENSION_SENSOR:
                return new BatteryTensionSensor(sensorValue);
            case VehicleSensorType.ENGINE_TEMPERATURE_SENSOR:
                return new EngineTemperatureSensor(sensorValue);
            //Throw error if VehicleSensorType not recognized
            default:
                throw new VehicleSensorNotFound();
        }
    }
}
