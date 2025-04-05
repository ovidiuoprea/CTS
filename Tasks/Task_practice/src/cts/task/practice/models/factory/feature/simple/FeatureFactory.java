package cts.task.practice.models.factory.feature.simple;
import cts.task.practice.abstracts.AFeature;
import cts.task.practice.enums.Features;
import cts.task.practice.exceptions.FeatureNotSupportedException;
import cts.task.practice.models.features.Antenna;
import cts.task.practice.models.features.Battery;
import cts.task.practice.models.features.Compass;
import cts.task.practice.models.features.Speaker;

public class FeatureFactory {
    public AFeature getFeature(Features feature, String name, int price) {
        switch (feature) {
            case Features.ANTENNA:
                return new Antenna(name, price);
            case Features.BATTERY:
                return new Battery(name, price);
            case Features.COMPASS:
                return new Compass(name, price);
            case Features.SPEAKER:
                return new Speaker(name, price);
            default:
                throw new FeatureNotSupportedException();
        }
    }
}
