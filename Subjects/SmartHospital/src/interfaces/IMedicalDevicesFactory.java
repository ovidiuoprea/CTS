package interfaces;

import enums.MedicalDeviceType;

public interface IMedicalDevicesFactory {
    AMedicalDevice getMedicalDevice(MedicalDeviceType type, String deviceName);
}
