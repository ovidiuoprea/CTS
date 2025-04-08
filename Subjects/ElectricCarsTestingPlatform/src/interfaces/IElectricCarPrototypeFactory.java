package interfaces;

import enums.ElectricCarType;
import models.builder.ElectricCar;

public interface IElectricCarPrototypeFactory {
    public ElectricCar getElectricCar(ElectricCarType type) throws CloneNotSupportedException;
}
