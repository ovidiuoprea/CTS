package cts.task.practice.models.prototype.factory.eager;

import cts.task.practice.exceptions.OSVersionNotImplementedException;
import cts.task.practice.models.prototype.OS;

import java.util.HashMap;

public class OSPrototypeFactoryEager {
    private static HashMap<Integer, OS> OSVersions = new HashMap<>();

    static {
        try {
            OSVersions.put(1, new OS(1));
            OSVersions.put(2, new OS(2));
        }
        catch (Exception exception) {
            System.out.println("Could not create OS due to: " + exception.getMessage());
        }
    }

    // Propagates CloneNotSupportedException to the caller, ensuring all code paths either return a valid OS or throw an exception
    public static OS getOS(int version) throws CloneNotSupportedException, OSVersionNotImplementedException {
        switch (version) {
            case 1:
                return (OS) OSVersions.get(1).clone();
            case 2:
                return (OS) OSVersions.get(2).clone();
            default:
                throw new OSVersionNotImplementedException(version);
        }
    }
}
