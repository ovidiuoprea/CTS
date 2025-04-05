import cts.task.practice.enums.CallType;
import cts.task.practice.enums.Features;
import cts.task.practice.abstracts.AFeature;
import cts.task.practice.models.factory.feature.method.FeatureFactoryMethod;
import cts.task.practice.models.factory.feature.simple.FeatureFactory;
import cts.task.practice.models.builder.Phone;
import cts.task.practice.models.singleton.lazy.GSMConnection;
import cts.task.practice.models.singleton.registry.GSMConnectionManager;


public class Main {
    public static void main(String[] args) {
        System.out.println("Requirement 1.\n");
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

        System.out.println("\nRequirement 2.\n");
        GSMConnection connection = GSMConnection.getInstance();
        GSMConnection connection2 = GSMConnection.getInstance();

        if(!connection.equals(connection2)) {
            throw new RuntimeException("GSM Connection singleton instance is not unique");
        }

        phone.call();
        phone2.call();

        System.out.println("Active calls for the GSM Connection: " + connection.getActiveCalls());

        System.out.println("\nRequirement 3.\n");
        GSMConnectionManager connectionPriority = GSMConnectionManager.getInstance(CallType.PRIORITY);
        GSMConnectionManager connectionNormal = GSMConnectionManager.getInstance(CallType.NORMAL);
        GSMConnectionManager connectionUrgent = GSMConnectionManager.getInstance(CallType.URGENT);

        // Testing if a singleton registry instance is unique:
        GSMConnectionManager connectionPriorityTest = GSMConnectionManager.getInstance(CallType.PRIORITY);

        if(!connectionPriority.equals(connectionPriorityTest)) {
            throw new RuntimeException("GSM Connection manager instance is not unique");
        }

        phone.callRegistry(CallType.URGENT);
        phone.callRegistry(CallType.PRIORITY);

        phone2.callRegistry(CallType.NORMAL);
        phone2.callRegistry(CallType.URGENT);

        System.out.println("Number of active PRIORITY calls: " + connectionPriority.getActiveCalls());
        System.out.println("Number of active URGENT calls: " + connectionUrgent.getActiveCalls());
        System.out.println("Number of active NORMAL calls: " + connectionNormal.getActiveCalls());

    }

}