import enums.ElectricCarType;
import enums.ServiceType;
import enums.VehicleSensorType;
import models.ServiceManager;
import models.builder.ElectricCar;
import models.builder.ElectricCarBuilder;
import models.builder.ElectricCarPrototypeFactory;
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


        try {
            ElectricCar teslaCopy = (ElectricCar) tesla.clone();

            System.out.println("Tesla: " + tesla);
            System.out.println("Tesla copy: " + teslaCopy);

            ElectricCar performance = new ElectricCarPrototypeFactory().getElectricCar(ElectricCarType.PERFORMANCE);
            ElectricCar city = new ElectricCarPrototypeFactory().getElectricCar(ElectricCarType.CITY);

            ElectricCar performance1 = new ElectricCarPrototypeFactory().getElectricCar(ElectricCarType.PERFORMANCE);
            ElectricCar performance2 = new ElectricCarPrototypeFactory().getElectricCar(ElectricCarType.PERFORMANCE);
            ElectricCar performance3 = new ElectricCarPrototypeFactory().getElectricCar(ElectricCarType.PERFORMANCE);


            System.out.println("Performance car: " + performance);
            System.out.println("City car & others: " + city + performance1 + performance2 + performance3);


        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException: " + e.getMessage());
        }
    }
}