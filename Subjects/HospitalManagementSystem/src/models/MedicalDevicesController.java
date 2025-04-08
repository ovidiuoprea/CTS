package models;

import abstracts.AMedicalDevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MedicalDevicesController implements Cloneable {
    private List<AMedicalDevice> medicalDevices = new ArrayList<AMedicalDevice>();
    private String departmentName;
    private static HashMap<String, MedicalDevicesController> instances = new HashMap<String, MedicalDevicesController>();

    private MedicalDevicesController(String departmentName) {
        this.departmentName = departmentName;
    }

    public static MedicalDevicesController getInstance(String departmentName) {
        MedicalDevicesController instance = instances.get(departmentName);
        if(instance == null) {
            instance = new MedicalDevicesController(departmentName);
            instances.put(departmentName, instance);
        }
        return instance;
    }

    public void addMedicalDevice(AMedicalDevice medicalDevice) {
        medicalDevices.add(medicalDevice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MedicalDevicesController clone = (MedicalDevicesController) super.clone();
        clone.medicalDevices = new ArrayList<>();
        for(AMedicalDevice medicalDevice : medicalDevices) {
            clone.medicalDevices.add((AMedicalDevice) medicalDevice.clone());
        }
        return clone;
    }

    @Override
    public String toString() {
        return "MedicalDevicesController{" +
                "medicalDevices=" + medicalDevices +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
