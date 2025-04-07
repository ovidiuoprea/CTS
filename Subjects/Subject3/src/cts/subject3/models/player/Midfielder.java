package cts.subject3.models.player;

import cts.subject3.abstracts.APlayer;
import cts.subject3.models.ProhibitedMedication;
import cts.subject3.models.Training;

import java.util.List;

public class Midfielder extends APlayer {
    Midfielder(String name, int age, List<Training> trainingSessions) {
        super(name, age, trainingSessions);
    }

    @Override
    public void addProhibitedMedication(ProhibitedMedication prohibitedMedication) {
        super.addProhibitedMedication(prohibitedMedication);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
