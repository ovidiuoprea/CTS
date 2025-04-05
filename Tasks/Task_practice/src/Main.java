import cts.task.practice.Features;
import cts.task.practice.abstracts.AFeature;
import cts.task.practice.models.factory.feature.method.FeatureFactoryMethod;
import cts.task.practice.models.factory.feature.simple.FeatureFactory;
import cts.task.practice.models.Phone;


public class Main {
    public static void main(String[] args) {
        FeatureFactory simpleFactory = new FeatureFactory();

        AFeature simpleAntenna = simpleFactory.getFeature(Features.ANTENNA, "Simple antenna", 10);
        AFeature simpleBattery = simpleFactory.getFeature(Features.BATTERY, "Simple battery", 20);
        AFeature simpleCompass = simpleFactory.getFeature(Features.COMPASS, "Simple compass", 30);
        AFeature simpleSpeaker = simpleFactory.getFeature(Features.SPEAKER, "Simple speaker", 40);

        Phone phone = new Phone(
                "Phone with simple factory features",
                "0.1.0-alpha",
                simpleAntenna,
                simpleBattery,
                simpleCompass,
                simpleSpeaker
        );
        System.out.println(phone);

        FeatureFactoryMethod factoryMethod = new FeatureFactoryMethod();
        AFeature methodAntenna = factoryMethod.getFeature(Features.ANTENNA, "Method antenna", 10);
        AFeature methodBattery = factoryMethod.getFeature(Features.BATTERY, "Method battery", 20);
        AFeature methodCompass = factoryMethod.getFeature(Features.COMPASS, "Method compass", 30);
        AFeature methodSpeaker = factoryMethod.getFeature(Features.SPEAKER, "Method speaker", 40);

        Phone phone2 = new Phone(
                "Phone with factory method features",
                "0.1.1-alpha",
                methodAntenna,
                methodBattery,
                methodCompass,
                methodSpeaker
        );

        System.out.println(phone2);
    }
}