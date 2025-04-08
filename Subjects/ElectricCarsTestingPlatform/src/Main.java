import enums.ServiceType;
import models.ServiceManager;

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
    }
}