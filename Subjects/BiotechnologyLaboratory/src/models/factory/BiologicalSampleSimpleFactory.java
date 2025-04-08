package models.factory;

import enums.BiologicalSampleType;
import interfaces.ABiologicalSample;
import interfaces.IBiologicalSampleFactory;

public class BiologicalSampleSimpleFactory implements IBiologicalSampleFactory {
    @Override
    public ABiologicalSample createBiologicalSample(BiologicalSampleType type, String geneticCode, double incubationTemperature) {
        return switch(type) {
            case VIRUS -> new Virus(geneticCode, incubationTemperature);
            case BACTERIA -> new Bacteria(geneticCode, incubationTemperature);
            case STEM_CELL -> new StemCell(geneticCode, incubationTemperature);
        };
    }
}
