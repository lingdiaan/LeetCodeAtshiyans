package honer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().trim().split(" ");
        int year = Integer.parseInt(s[0]);
        int mon = Integer.parseInt(s[1]);
        int week = Integer.parseInt(s[2]);
        int day = Integer.parseInt(s[3]);
        int passDay=0;
        int[] mons = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        if ((year%4==0&&year%100!=0)||(year%4==0&&year%400==0)) mons[2]=29;
        for (int i = 0; i < mon; i++) {
            passDay+=mons[i];
        }

//        else
//         System.out.println(year+"-"+mon+"-"+newDay);
        int a=0;
        //for循环,先计算输入年份距离公元1月1日有多少天
        for(int i=1; i<year; i++){
            if(i%4==0 && i%100!=0 || i%400==0){
                a=a+366; //闰年2月多1天,一共366
            }else{
                a=a+365;
            }
        }
        int weekd = (a%7)+1;//公元1月1日是星期日,因此要算每年的1月1日是星期几,对7求余后要加1.
        //如果公元1月1日是星期一,总共天数对7求余,结果是几,就是星期几
        int monthFirst=((passDay)%7+weekd)%7;
        if(monthFirst==0) monthFirst=7;
        if(week==1&&monthFirst>day){
            System.out.println(0);
            return;
        }
        int newDay=0;
        if(monthFirst>day){
            newDay = (week-2)*7+7-monthFirst;
        }
        if(monthFirst<day){
            newDay = (week-1)*7+day-monthFirst;
        }

        if(newDay>28&&!isRun(year)&&mon==2) System.out.println(0);
        else if(newDay>29&&isRun(year)&&mon==2)System.out.println(0);
        else if(newDay>30&&isSmall(mon)) System.out.println(0);
        else if(newDay>31) System.out.println(0);
        else if(newDay<=0) System.out.println(0);
        System.out.println(year+"-"+mon+"-"+(newDay+1));
    }


    public static boolean isRun(int year){
        if((year%2==0&&year%100!=0)||year%400==0)
            return true;
        return false;
    }
    public static boolean isSmall(int mon){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(8);
        set.add(10);
        set.add(12);
        return set.contains(mon);
    }
}
