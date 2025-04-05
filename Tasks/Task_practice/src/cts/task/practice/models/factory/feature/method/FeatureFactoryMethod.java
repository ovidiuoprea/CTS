package cts.task.practice.models.factory.feature.method;

import cts.task.practice.Features;
import cts.task.practice.abstracts.AFeature;
import cts.task.practice.exceptions.FeatureNotSupportedException;
import cts.task.practice.models.features.Antenna;
import cts.task.practice.models.features.Battery;
import cts.task.practice.models.features.Compass;
import cts.task.practice.models.features.Speaker;

public class FeatureFactoryMethod implements IFeatureFactory {
    @Override
    public AFeature getFeature(Features feature, String name, int price) {
        return switch (feature) {
            case Features.ANTENNA -> new Antenna(name, price);
            case Features.BATTERY -> new Battery(name, price);
            case Features.COMPASS -> new Compass(name, price);
            case Features.SPEAKER -> new Speaker(name, price);
            default -> throw new FeatureNotSupportedException();
        };
    }
}
