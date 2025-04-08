package interfaces;

public abstract class ABiologicalSample implements IBiologicalSample, Cloneable{
    String sampleType;
    String geneticCode;
    double incubationTemperature;

    protected ABiologicalSample(String geneticCode, double incubationTemperature) {
        this.sampleType = this.getClass().getSimpleName();
        this.geneticCode = geneticCode;
        this.incubationTemperature = incubationTemperature;
    }

    @Override
    public String getSampleType() {
        return sampleType;
    }

    @Override
    public String getGeneticCode() {
        return geneticCode;
    }

    @Override
    public double getIncubationTemperature() {
        return incubationTemperature;
    }

    @Override
    public void processSample() {
        System.out.println("Processing sample " + geneticCode + "at " + incubationTemperature + "degrees...");
    }

    @Override
    public void printReport() {
        System.out.println("Printing report for " + geneticCode + "at " + incubationTemperature + "degrees...");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
