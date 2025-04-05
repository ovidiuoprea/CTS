package cts.task.practice.models.factory.feature.method;
import cts.task.practice.Features;
import cts.task.practice.abstracts.AFeature;

public interface IFeatureFactory {
    public AFeature getFeature(Features feature, String name, int price);
}
