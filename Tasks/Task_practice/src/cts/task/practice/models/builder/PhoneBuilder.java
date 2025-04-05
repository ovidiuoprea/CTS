package cts.task.practice.models.builder;

import cts.task.practice.models.features.Antenna;
import cts.task.practice.models.features.Battery;
import cts.task.practice.models.features.Compass;
import cts.task.practice.models.features.Speaker;

public class PhoneBuilder extends APhoneBuilder{
    Phone phone;

    public PhoneBuilder(String identifier, String version) {
        this.phone = new Phone(identifier, version);
    }

    @Override
    public APhoneBuilder addAntenna(Antenna antenna) {
        this.phone.setAntenna(antenna);
        return this;
    }

    @Override
    public APhoneBuilder addBattery(Battery battery) {
        this.phone.setBattery(battery);
        return this;
    }

    @Override
    public APhoneBuilder addCompass(Compass compass) {
        this.phone.setCompass(compass);
        return this;
    }

    @Override
    public APhoneBuilder addSpeaker(Speaker speaker) {
        this.phone.setSpeaker(speaker);
        return this;
    }

    @Override
    public Phone build() {
        return this.phone;
    }
}
