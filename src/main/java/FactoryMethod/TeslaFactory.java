package FactoryMethod;

import SimpleFactory.Car;
import SimpleFactory.Tesla;

public class TeslaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
