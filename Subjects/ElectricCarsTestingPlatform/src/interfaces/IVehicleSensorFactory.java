package interfaces;

import enums.VehicleSensorType;
import models.factory.AVehicleSensor;

public interface IVehicleSensorFactory {
    AVehicleSensor getVehicleSensor(VehicleSensorType vehicleSensorType, double sensorValue);
}
