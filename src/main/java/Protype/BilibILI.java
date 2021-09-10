package Protype;

import java.util.Date;
import java.util.HashMap;

public class BilibILI {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v = new Video("咒术回战",date);

        Video c = (Video) v.clone();
        System.out.println(v);
        System.out.println(c);
        System.out.println("==================");
        c.setName("盗版咒术回战");
        date.setTime(22131231);
        System.out.println(v);
        System.out.println(c);


    }

}
