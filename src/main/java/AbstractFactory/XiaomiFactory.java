package AbstractFactory;

public class XiaomiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public RouteProduct router() {
        return new XiaomiRouter();
    }
}
