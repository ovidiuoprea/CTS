package models.builder;

import interfaces.IElectricCarsBuilder;

public class ElectricCarBuilder implements IElectricCarsBuilder {
    private ElectricCar car;

    public ElectricCarBuilder(String batteryType, int range, int numberOfEngines, String coolingSystem) {
        car = new ElectricCar(batteryType, range, numberOfEngines, coolingSystem);
    }

    public ElectricCarBuilder addFastCharging() {
        car.setSupportsFastCharging(true);
        return this;
    }

    public ElectricCarBuilder addAdaptiveSuspension() {
        car.setHasAdaptiveSuspension(true);
        return this;
    }

    public ElectricCarBuilder addAutoPilot() {
        car.setHasAutoPilot(true);
        return this;
    }

    @Override
    public ElectricCar build() {
        System.out.println("Building car!");
        Thread thread = new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.run();
        return car;
    }
}
