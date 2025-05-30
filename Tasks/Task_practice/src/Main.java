import cts.task.practice.constants.OSVersion;
import cts.task.practice.enums.CallType;
import cts.task.practice.enums.Features;
import cts.task.practice.abstracts.AFeature;
import cts.task.practice.exceptions.OSVersionNotImplementedException;
import cts.task.practice.models.prototype.OS;
import cts.task.practice.models.builder.PhoneBuilder;
import cts.task.practice.models.factory.feature.method.FeatureFactoryMethod;
import cts.task.practice.models.factory.feature.simple.FeatureFactory;
import cts.task.practice.models.builder.Phone;
import cts.task.practice.models.features.Compass;
import cts.task.practice.models.features.Speaker;
import cts.task.practice.models.features.Battery;
import cts.task.practice.models.features.Antenna;
import cts.task.practice.models.prototype.factory.eager.OSPrototypeFactoryEager;
import cts.task.practice.models.prototype.factory.lazy.OSPrototypeFactoryLazy;
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

        // FIXME: Mixing Feature Factory Method and Feature Simple Factory to ensure they work together.
        Phone builderPhone1 = new PhoneBuilder("Phone 1 created with builder", "0.2.0")
                .addCompass((Compass) new FeatureFactoryMethod().getFeature(Features.COMPASS, "compass", 10))
                .addSpeaker((Speaker) new FeatureFactoryMethod().getFeature(Features.SPEAKER, "speaker", 20))
                .addAntenna((Antenna) new FeatureFactory().getFeature(Features.ANTENNA, "antenna", 30))
                .build();

        System.out.println("\nRequirement 4. \n");
        System.out.println("Custom phone created with builder:\n" + builderPhone1 + "\n");

        Phone builderPhone2 = new PhoneBuilder("Phone 2 created with builder", "0.2.0")
                .addCompass((Compass) new FeatureFactory().getFeature(Features.COMPASS, "compass", 10))
                .addSpeaker((Speaker) new FeatureFactoryMethod().getFeature(Features.SPEAKER, "speaker", 20))
                .addAntenna((Antenna) new FeatureFactory().getFeature(Features.ANTENNA, "antenna", 30))
                .addBattery((Battery) new FeatureFactoryMethod().getFeature(Features.BATTERY, "battery", 40))
                .build();

        System.out.println("Custom phone created with builder:\n" + builderPhone2 + "\n");

        Phone builderPhone3 = new PhoneBuilder("Phone 3 created with builder", "0.3.0")
                .build();

        System.out.println("Custom phone created with builder:\n" + builderPhone3 + "\n");

        System.out.println("\nRequirement 5.\n");
        try {
            OS os = new OS(1);
            System.out.println("Created the OS: " + os);

            OS prototypeOS = (OS) os.clone();
            System.out.println("Prototype OS: " + prototypeOS);
        }
        catch (InterruptedException e) {
            System.out.println("Could not create OS due to: " + e.getMessage());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nRequirement 6 - Eager.\n");
        try {
            OS OSversion1 = OSPrototypeFactoryEager.getOS(OSVersion.VERSION_1);
            OS OSversion2 = OSPrototypeFactoryEager.getOS(OSVersion.VERSION_2);

            OS OSVersion1Copy = OSPrototypeFactoryEager.getOS(OSVersion.VERSION_1);
            OS OSVersion1Copy2 = OSPrototypeFactoryEager.getOS(OSVersion.VERSION_1);
            OS OSVersion2Copy = OSPrototypeFactoryEager.getOS(OSVersion.VERSION_2);

            System.out.println("\nAll the objects created using prototype factory eager:\n");
            System.out.println(OSversion1);
            System.out.println(OSversion2);

            System.out.println(OSVersion1Copy);
            System.out.println(OSVersion1Copy2);
            System.out.println(OSVersion2Copy);

            System.out.println("Creating OS with version not already implemented: ");
            OS OSversion3 = OSPrototypeFactoryEager.getOS(OSVersion.VERSION_3);
        }
        catch (CloneNotSupportedException exception) {
            System.out.println("Cloning the OS failed due to: " + exception.getMessage());
        }
        catch (OSVersionNotImplementedException exception) {
            System.out.println("Could not create the OS due to: " + exception.getMessage());
        }

        System.out.println("\nRequirement 6 - Lazy.\n");
        try {
            OS OSVersion1 = OSPrototypeFactoryLazy.getOS(OSVersion.VERSION_1);
            OS OSVersion1Copy = OSPrototypeFactoryLazy.getOS(OSVersion.VERSION_1);

            OS OSVersion2 = OSPrototypeFactoryLazy.getOS(OSVersion.VERSION_2);
            OS OSVersion2Copy = OSPrototypeFactoryLazy.getOS(OSVersion.VERSION_2);

            System.out.println("\nAll the objects created using prototype factory lazy:\n");
            System.out.println(OSVersion1);
            System.out.println(OSVersion2);

            System.out.println(OSVersion1Copy);
            System.out.println(OSVersion2Copy);

            // Test creating a phone with a prototype factory OS via the builder:
            Phone phoneOS = new PhoneBuilder("Phone with OS created with builder", "0.3.0")
                    .addOS(OSPrototypeFactoryLazy.getOS(OSVersion.VERSION_1))
                    .addAntenna((Antenna) new FeatureFactoryMethod().getFeature(Features.ANTENNA, "antenna", 30))
                    .build();

            System.out.println("Phone with prototype OS created with builder: " + phoneOS);

            System.out.println("Creating OS with version not already implemented: ");
            OS OSVersion3 = OSPrototypeFactoryLazy.getOS(OSVersion.VERSION_3);
        }
        catch (InterruptedException | CloneNotSupportedException exception) {
            System.out.println("Cloning the OS failed due to: " + exception.getMessage());
        }
        catch (OSVersionNotImplementedException exception) {
            System.out.println("Could not create the OS due to: " + exception.getMessage());
        }
    }
}