package cts.task.practice.models.builder;

import cts.task.practice.models.features.Antenna;
import cts.task.practice.models.features.Battery;
import cts.task.practice.models.features.Compass;
import cts.task.practice.models.features.Speaker;

public abstract class APhoneBuilder {
    public abstract APhoneBuilder addAntenna(Antenna antenna);
    public abstract APhoneBuilder addBattery(Battery battery);
    public abstract APhoneBuilder addCompass(Compass compass);
    public abstract APhoneBuilder addSpeaker(Speaker speaker);

    public abstract Phone build();
}
