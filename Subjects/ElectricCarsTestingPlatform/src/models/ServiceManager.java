package models;

import enums.ServiceType;
import interfaces.PlatformModule;

import java.util.HashMap;

public class ServiceManager implements PlatformModule {

    private static HashMap<ServiceType, ServiceManager> instances = new HashMap<ServiceType, ServiceManager>();

    private String moduleName;

    private ServiceManager() {
        this.moduleName = "";
    }

    public static ServiceManager getInstance(ServiceType serviceType) {
        ServiceManager instance = instances.get(serviceType);
        if(instance == null) {
            instance = new ServiceManager();
            // Honestly, I don't know if we should even have moduleName, I don't want to pass it as a parameter.
            instance.moduleName = serviceType.toString();
            instances.put(serviceType, instance);
        }
        return instance;
    }

    @Override
    public String getModuleName() {
        return "";
    }

    @Override
    public void displayData() {
        System.out.println("The " + this.getClass().getSimpleName() + " " + moduleName + " is displaying data");
    }
}
