package interfaces;

public abstract class AMedicalDevice implements MedicalDevice {
    String deviceName;

    public AMedicalDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void collectData() {
        System.out.println(deviceName + " is collecting data.");
    }

    @Override
    public String getDeviceName() {
        return deviceName;
    }
}
