package interfaces;

public interface IBiologicalSample {
    String getSampleType();
    String getGeneticCode();
    double getIncubationTemperature();

    void processSample();
    void printReport();
}
