package cts.task.practice.models;
import cts.task.practice.abstracts.AFeature;
import cts.task.practice.models.factory.feature.simple.FeatureFactory;

public class Phone {
    String identifier;
    String version;
    AFeature antenna;
    AFeature battery; // example
    AFeature compass;
    AFeature speaker;

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
}
