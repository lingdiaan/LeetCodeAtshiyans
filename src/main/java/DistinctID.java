import java.util.Date;

public class DistinctID {
    public static void main(String[] args) {
        Date date = new Date();
        for (int i = 0; i <10000 ; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i).reverse();
            while(sb.length()<5) sb.append(0);
            System.out.println(sb.reverse().toString());
        }
        System.out.println(date);
        System.out.println(new Date());
    }
}
