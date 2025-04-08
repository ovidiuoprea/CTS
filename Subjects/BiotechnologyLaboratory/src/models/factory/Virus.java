package models.factory;

import interfaces.ABiologicalSample;

public class Virus extends ABiologicalSample {
    Virus(String geneticCode, double incubationTemperature) {
        super(geneticCode, incubationTemperature);
    }

    @Override
    public String getSampleType() {
        return super.getSampleType();
    }

    @Override
    public String getGeneticCode() {
        return super.getGeneticCode();
    }

    @Override
    public double getIncubationTemperature() {
        return super.getIncubationTemperature();
    }

    @Override
    public void processSample() {
        super.processSample();
    }

    @Override
    public void printReport() {
        super.printReport();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
