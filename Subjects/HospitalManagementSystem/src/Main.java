import models.MedicalDevicesController;
import models.Ventilator;

public class Main {
    public static void main(String[] args) {
        MedicalDevicesController medicalDevicesController = MedicalDevicesController.getInstance("ICU");
        medicalDevicesController.addMedicalDevice(new Ventilator("Ventilator1"));

        try {
            MedicalDevicesController copy = (MedicalDevicesController) medicalDevicesController.clone();
            System.out.println(copy);
        }
        catch(CloneNotSupportedException exception) {
            System.out.println(exception.getMessage());
        }

    }
}