package models.medicaldevices;

import interfaces.AMedicalDevice;

public class EKG extends AMedicalDevice {
    public EKG(String deviceName) {
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
