package models.singleton;

import enums.PlatformServiceType;
import interfaces.PlatformService;

import java.util.HashMap;

public class PlatformServiceManager implements PlatformService {
    private static HashMap<PlatformServiceType, PlatformServiceManager> instances = new HashMap<PlatformServiceType, PlatformServiceManager>();
    private String name;

    private PlatformServiceManager() {
        this.name = "";
    }

    public static PlatformServiceManager getInstance(PlatformServiceType type) {
        PlatformServiceManager instance = instances.get(type);
        if(instance == null) {
            instance = new PlatformServiceManager();
            instance.name = type.toString();
            instances.put(type, instance);
        }

        return instance;
    }

    @Override
    public void executeService() {
        System.out.println("Executing service...");
    }
}
