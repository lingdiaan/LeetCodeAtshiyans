package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        new WulingFactory().getCar().Name();
        new TeslaFactory().getCar().Name();
    }
}
