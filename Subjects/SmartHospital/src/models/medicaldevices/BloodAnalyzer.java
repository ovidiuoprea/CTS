package models.medicaldevices;

import interfaces.AMedicalDevice;

public class BloodAnalyzer extends AMedicalDevice {
    BloodAnalyzer(String deviceName) {
        super(deviceName);
    }

    @Override
    public void collectData() {
        super.collectData();
    }

    @Override
    public String getDeviceName() {
        return super.getDeviceName();
    }
}
