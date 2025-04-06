package cts.subject2.models.builder;

import cts.subject2.models.decoration.ADecoration;
import cts.subject2.models.floor.AFloor;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    float area;
    int numberOfEntrances;
    AFloor floor;
    List<ADecoration> decorations;

    Store(String name, float area, int numberOfEntrances) {
        this.name = name;
        this.area = area;
        this.numberOfEntrances = numberOfEntrances;
        this.decorations = new ArrayList<>();
    }

    void setFloor(AFloor floor) {
        this.floor = floor;
    }

    void setNumberOfEntrances(int numberOfEntrances) {
        this.numberOfEntrances = numberOfEntrances;
    }

    void addDecoration(ADecoration decoration) {
        decorations.add(decoration);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", numberOfEntrances=" + numberOfEntrances +
                ", floor=" + floor +
                ", decorations=" + decorations +
                '}';
    }

    public int getTotalFireHazardLevel() {
        int fireHazardLevel = 0;
        int totalFireHazardItems = 0;

        fireHazardLevel += floor.getFireHazardLevel();
        totalFireHazardItems++;

        if(!decorations.isEmpty()) {
            for(ADecoration decoration : decorations) {
                fireHazardLevel += decoration.getFireHazardLevel();
                totalFireHazardItems++;
            }
        }

        return fireHazardLevel / totalFireHazardItems;
    }
}
