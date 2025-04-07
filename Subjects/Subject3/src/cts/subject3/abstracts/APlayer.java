package cts.subject3.abstracts;

import cts.subject3.models.ProhibitedMedication;
import cts.subject3.models.ProhibitedMedicationManager;
import cts.subject3.models.Training;

import java.util.ArrayList;
import java.util.List;

public class APlayer implements Cloneable {
    String name;
    int age;
    List<Training> trainingSessions;
    List<ProhibitedMedication> prohibitedMedications;

    public APlayer(String name, int age, List<Training> trainingSessions) {
        this.name = name;
        this.age = age;
        this.trainingSessions = trainingSessions;
        ProhibitedMedicationManager prohibitedMedicationManager = ProhibitedMedicationManager.getInstance();
        this.prohibitedMedications = prohibitedMedicationManager.getProhibitedMedications();
    }

    public void addProhibitedMedication(ProhibitedMedication prohibitedMedication) {
        System.out.println("Adding " + prohibitedMedication + " to the prohibited medication list");
        ProhibitedMedicationManager prohibitedMedicationManager = ProhibitedMedicationManager.getInstance();
        prohibitedMedicationManager.addProhibitedMedication(prohibitedMedication);
    }

    public void addTrainingSession(Training trainingSession) {
        trainingSessions.add(trainingSession);
    }

    public String testForDoping(String medicationName, float discoveredValue) {
        System.out.println("\nTesting " + name + " for doping with " + medicationName + " with a value of " + discoveredValue + "u.m");
        for(ProhibitedMedication medication : prohibitedMedications) {
            if(medication.getName().equalsIgnoreCase(medicationName)) {
                if(discoveredValue >= medication.getLimit()) {
                    return "Subject marked as positive for doping with " + medication.getName();
                }
                else {
                    return "Subject marked as negative for doping with " + medication.getName();
                }
            }
        }
        return medicationName + " not marked as prohibited for doping.";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Medication list not being deep cloned due to it being shared by all the players
        APlayer player = (APlayer) super.clone();
        player.trainingSessions = new ArrayList<>(trainingSessions);
        return player;
    }

    @Override
    public String toString() {
        //TODO: Refactor this with string builder
        String output =  "APlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", trainingSessions= \n[\n" ;

        for(Training trainingSession : trainingSessions) {
            output += "\t" + trainingSession.toString() + "\n";
        }
        output += "], prohibitedMedications=\n[\n";
        for(ProhibitedMedication medication : prohibitedMedications) {
            output += "\t" + medication.toString() + "\n";
        }
        output += "]}";

        return  output;
    }
}
