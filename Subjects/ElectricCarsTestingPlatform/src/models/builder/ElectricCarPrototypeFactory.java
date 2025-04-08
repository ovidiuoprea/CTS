package models.builder;

import enums.ElectricCarType;
import interfaces.IElectricCarPrototypeFactory;

import java.util.HashMap;

public class ElectricCarPrototypeFactory implements IElectricCarPrototypeFactory {
    private static HashMap<ElectricCarType, ElectricCar> templateCars = new HashMap<>();

    static {
        templateCars.put(
                ElectricCarType.CITY,
                new ElectricCarBuilder("Li-ion", 100, 1, "Air")
                        .addFastCharging()
                        .build()
        );
        templateCars.put(
                ElectricCarType.PERFORMANCE,
                new ElectricCarBuilder("Li-ion", 350, 4, "Water")
                        .addAutoPilot()
                        .addAdaptiveSuspension()
                        .addFastCharging()
                        .build()
        );
    }

    @Override
    public ElectricCar getElectricCar(ElectricCarType type) throws CloneNotSupportedException {
        // if(templateCars.get(type) == null ) throw Exception;
        return (ElectricCar) templateCars.get(type).clone();
    }
}
