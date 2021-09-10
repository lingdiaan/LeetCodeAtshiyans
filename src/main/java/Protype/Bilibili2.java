package Protype;

import java.util.Date;

public class Bilibili2 {
    public static void main(String[] args) throws CloneNotSupportedException {


        Date date = new Date();
        VideoDeep v = new VideoDeep("咒术回战", date);

        VideoDeep c = (VideoDeep) v.clone();
        System.out.println(c);
        System.out.println(v);
        System.out.println("==========");
        date.setTime(12131415);
        System.out.println(c);
        System.out.println(v);
    }
}