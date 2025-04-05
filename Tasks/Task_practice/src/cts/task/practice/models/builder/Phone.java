package cts.task.practice.models.builder;
import cts.task.practice.abstracts.AFeature;
import cts.task.practice.enums.CallType;
import cts.task.practice.models.prototype.OS;
import cts.task.practice.models.singleton.lazy.GSMConnection;
import cts.task.practice.models.singleton.registry.GSMConnectionManager;

public class Phone {
    String identifier;
    String version;
    AFeature antenna;
    AFeature battery; // example
    AFeature compass;
    AFeature speaker;
    OS os;

    Phone(String identifier, String version) {
        this.identifier = identifier;
        this.version = version;
    }

    // TODO: Delete this, or at least make it package visibility, as it's only used to test the factories in Main
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
                ", os=" + os +
                '}';
    }

    public void setAntenna(AFeature antenna) {
        this.antenna = antenna;
    }

    public void setBattery(AFeature battery) {
        this.battery = battery;
    }

    public void setCompass(AFeature compass) {
        this.compass = compass;
    }

    public void setSpeaker(AFeature speaker) {
        this.speaker = speaker;
    }

    public void setOS(OS os) {
        this.os = os;
    }

    public void call() {
        GSMConnection gsmConnection = GSMConnection.getInstance();
        gsmConnection.call();
    }

    public void callRegistry(CallType callType) {
        GSMConnectionManager connection = GSMConnectionManager.getInstance(callType);
        connection.call();
    }



}
