package AbstractFactory;

public class HUAWEIFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new HUAWEIPhone();
    }

    @Override
    public RouteProduct router() {
        return null;
    }
}
