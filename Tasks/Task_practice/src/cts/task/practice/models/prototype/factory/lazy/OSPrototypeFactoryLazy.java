package cts.task.practice.models.prototype.factory.lazy;

import cts.task.practice.exceptions.OSVersionNotImplementedException;
import cts.task.practice.models.prototype.OS;

import java.util.HashMap;

public class OSPrototypeFactoryLazy {
    private static HashMap<Integer, OS> versions = new HashMap<>();
    public static final Integer OS_VERSIONS_COUNT = 2;

    public static OS getOS(int version) throws InterruptedException, CloneNotSupportedException, OSVersionNotImplementedException {
        if(version > 0 && version <= OS_VERSIONS_COUNT) {
            OS os = versions.get(version);
            if(os == null) {
                os = new OS(version);
                versions.put(version, os);
                return os;
            }
            return (OS)os.clone();
        }
        else {
            throw new OSVersionNotImplementedException(version);
        }
    }
}
