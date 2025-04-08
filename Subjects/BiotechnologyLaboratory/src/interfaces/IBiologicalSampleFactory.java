package interfaces;

import enums.BiologicalSampleType;

public interface IBiologicalSampleFactory {
    ABiologicalSample createBiologicalSample(BiologicalSampleType type, String geneticCode, double incubationTemperature);
}
