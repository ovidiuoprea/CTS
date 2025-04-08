package models.medicaldevices;

import interfaces.AMedicalDevice;

public class EKG extends AMedicalDevice {
    EKG(String deviceName) {
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
