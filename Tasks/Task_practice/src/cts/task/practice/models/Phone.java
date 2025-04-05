package cts.task.practice.models;
import cts.task.practice.abstracts.AFeature;
import cts.task.practice.enums.CallType;
import cts.task.practice.models.factory.feature.simple.FeatureFactory;
import cts.task.practice.models.singleton.lazy.GSMConnection;
import cts.task.practice.models.singleton.registry.GSMConnectionManager;

public class Phone {
    String identifier;
    String version;
    AFeature antenna;
    AFeature battery; // example
    AFeature compass;
    AFeature speaker;

    GSMConnection gsmConnection = GSMConnection.getInstance();

    public Phone(String identifier, String version, AFeature antenna, AFeature battery, AFeature compass, AFeature speaker) {
        this.identifier = identifier;
        this.version = version;
        this.antenna = antenna;
        this.battery = battery;
        this.compass = compass;
        this.speaker = speaker;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "identifier='" + identifier + '\'' +
                ", version='" + version + '\'' +
                ", antenna=" + antenna +
                ", battery=" + battery +
                ", compass=" + compass +
                ", speaker=" + speaker +
                '}';
    }

    public void call() {
        gsmConnection.call();
    }

    public void callRegistry(CallType callType) {
        GSMConnectionManager connection = GSMConnectionManager.getInstance(callType);
        connection.call();
    }



}
