package SimpleFactory;

//静态工厂
public class Factory {
public static Car getCar(String name){
    if(name=="五菱宏光") return new Wuling();
    else return  null;
}
}
