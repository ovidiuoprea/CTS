import enums.ServiceType;
import enums.VehicleSensorType;
import models.ServiceManager;
import models.builder.ElectricCar;
import models.builder.ElectricCarBuilder;
import models.factory.*;

public class Main {
    public static void main(String[] args) {
        ServiceManager telemetry = ServiceManager.getInstance(ServiceType.TELEMETRY);
        System.out.println(telemetry);

        ServiceManager performanceControl = ServiceManager.getInstance(ServiceType.PERFORMANCE_CONTROL);
//        System.out.println(performanceControl);

        ServiceManager diagnosis = ServiceManager.getInstance(ServiceType.DIAGNOSIS);
//        System.out.println(diagnosis);

        ServiceManager telemetryTest = ServiceManager.getInstance(ServiceType.TELEMETRY);
        System.out.println(telemetryTest);

        telemetry.displayData();

        if(!telemetry.equals(telemetryTest)) {
            throw new RuntimeException("The instances are not the same!");
        }

        ElectricCar tesla = new ElectricCarBuilder("Li-Ion", 400, 1, "Air")
                .addFastCharging()
                .addAdaptiveSuspension()
                .addAutoPilot()
                .build();

        System.out.println(tesla);

        VehicleSensorFactory vehicleSensorFactory = new VehicleSensorFactory();

        Accelerometer accelerometer = (Accelerometer) vehicleSensorFactory.getVehicleSensor(VehicleSensorType.ACCELEROMETER, 0);
        System.out.println("Accelerometer sensor: " + accelerometer.readSensorValue());

        EngineTemperatureSensor engineTemperatureSensor = (EngineTemperatureSensor) vehicleSensorFactory.getVehicleSensor(VehicleSensorType.ENGINE_TEMPERATURE_SENSOR, 200);
        System.out.println("Engine temperature sensor: " + engineTemperatureSensor.readSensorValue());

        BatteryTensionSensor batteryTensionSensor = (BatteryTensionSensor) vehicleSensorFactory.getVehicleSensor(VehicleSensorType.BATTERY_TENSION_SENSOR, 24);
        System.out.println("Battery tension sensor: " + batteryTensionSensor.readSensorValue());

        BatteryTensionSensor batteryTensionSensor1 = (BatteryTensionSensor) vehicleSensorFactory.getVehicleSensor(VehicleSensorType.BATTERY_TENSION_SENSOR, 12);
        System.out.println("Battery tension sensor: " + batteryTensionSensor1.readSensorValue());

    }
}