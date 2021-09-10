package AbstractFactory;

//抽象产品工厂
public interface IProductFactory {
    //生产手机
    IphoneProduct iphoneProduct();

    RouteProduct router();
}
