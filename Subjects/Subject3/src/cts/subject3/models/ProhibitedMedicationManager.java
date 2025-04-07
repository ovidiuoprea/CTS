package cts.subject3.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProhibitedMedicationManager {
    private List<ProhibitedMedication> prohibitedMedications;
    private static ProhibitedMedicationManager instance = new ProhibitedMedicationManager();

    private ProhibitedMedicationManager() {
        prohibitedMedications = Stream.of(
                new ProhibitedMedication("Annabolic steroids", 0),
                new ProhibitedMedication("Stimulants", 0),
                new ProhibitedMedication("Paracetamol", 100)
        ).collect(Collectors.toList());
    }

    public static ProhibitedMedicationManager getInstance() {
        return instance;
    }

    public List<ProhibitedMedication> getProhibitedMedications() {
        return prohibitedMedications;
    }

    public void addProhibitedMedication(ProhibitedMedication prohibitedMedication) {
        this.prohibitedMedications.add(prohibitedMedication);
    }

}
