import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@Transactional
public class UserTest {

    public static void main(String[] args) throws MyException {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        User user = (User) ac.getBean("user");
//        System.out.println(user.toString());
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("bean.xml"));
//        User user = (User)bf.getBean("user");
//        System.out.println(user.toString());
//        System.out.println(user.getDog().toString());
//        Dog dog1 = new Dog("wangcai",5);
//        Dog dog2 = new Dog("wangcai",5);
//        System.out.println(dog1.equals(dog2));
//        System.out.println(dog1.hashCode()==dog2.hashCode());
//        throw new MyException("运行结束"

String s = new String("ABCDEFG");
String a = "ABC";
        System.out.println(s.regionMatches(1, a, 1, 2));
//        System.out.println(s==a);



    }
    public static void digui(){
        digui();
    }


}
