import enums.MedicalDeviceType;
import models.medicaldevices.BloodAnalyzer;
import models.medicaldevices.EKG;
import models.medicaldevices.MedicalDevicesSimpleFactory;
import models.medicaldevices.Thermometer;

public class Main {
    public static void main(String[] args) {
        MedicalDevicesSimpleFactory simpleFactory = new MedicalDevicesSimpleFactory();

        EKG ekg = (EKG) simpleFactory.getMedicalDevice(MedicalDeviceType.EKG, "ekg1");
        ekg.collectData();

        Thermometer thermometer = (Thermometer) simpleFactory.getMedicalDevice(MedicalDeviceType.THERMOMETER, "thermometer1");
        thermometer.collectData();

        BloodAnalyzer bloodAnalyzer = (BloodAnalyzer) simpleFactory.getMedicalDevice(MedicalDeviceType.BLOOD_ANALYZER, "bloodAnalyzer1");
        bloodAnalyzer.collectData();

    }
}