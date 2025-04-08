package models.medicaldevices;

import enums.MedicalDeviceType;
import interfaces.AMedicalDevice;
import interfaces.IMedicalDevicesFactory;

public class MedicalDevicesSimpleFactory implements IMedicalDevicesFactory {
    @Override
    public AMedicalDevice getMedicalDevice(MedicalDeviceType type, String deviceName) {
        return switch (type) {
            case EKG -> new EKG(deviceName);
            case THERMOMETER -> new Thermometer(deviceName);
            case BLOOD_ANALYZER -> new BloodAnalyzer(deviceName);
        };
    }
}
