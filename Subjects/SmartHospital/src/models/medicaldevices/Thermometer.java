package models.medicaldevices;

import interfaces.AMedicalDevice;

public class Thermometer extends AMedicalDevice {
    Thermometer(String deviceName) {
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
