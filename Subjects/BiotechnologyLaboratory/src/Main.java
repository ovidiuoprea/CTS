import enums.BiologicalSampleType;
import models.factory.BiologicalSampleSimpleFactory;
import models.factory.Virus;

public class Main {
    public static void main(String[] args) {
        BiologicalSampleSimpleFactory factory = new BiologicalSampleSimpleFactory();

        Virus virus = (Virus) factory.createBiologicalSample(BiologicalSampleType.VIRUS, "1234", 22);
        virus.processSample();

        try {
            Virus virusCopy = (Virus) virus.clone();
            virusCopy.setIncubationTemperature(24);
            virusCopy.processSample();
            virusCopy.printReport();
            virus.printReport();
        }
        catch (CloneNotSupportedException exception) {
            System.out.println(exception.getMessage());
        }
    }
}