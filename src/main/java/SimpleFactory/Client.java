package SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Car car = Factory.getCar("五菱宏光");
        car.Name();
    }
}
