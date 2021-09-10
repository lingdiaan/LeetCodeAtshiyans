package FactoryMethod;

import SimpleFactory.Car;
import SimpleFactory.Factory;
import SimpleFactory.Wuling;

public class WulingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
