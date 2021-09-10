import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public class StringInterTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        String str2 = new String("str")+new String("01");
//        str2.intern();
//        String str1 = "str01";
//        System.out.println(str2==str1);
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        String username = "root";
//        String password = "1234";
//        String url = "jdbc:mysql://localhost:3306/mybatis";
//        Connection c = DriverManager.getConnection(url,username,password);
//        Statement statement = c.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from `user`");
//        while(resultSet.next()){
//            System.out.print(resultSet.getObject("id"));
//            System.out.print(resultSet.getObject("name"));
//            System.out.println(resultSet.getObject("pwd"));
//        }
        int[] a = new int[]{9,4,7,8,6,3,2,1,5};
        kuaipai(a,0,8);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+",");
        }

    }

    public static void kuaipai(int[] a,int start,int end){
        if(start<end){
        int left = start;
        int right = end;
        int s = a[start];
        while(left<right){
            while(left<right&&a[right]>=s)
                right--;
            a[left]=a[right];
            while(left<right&&a[left]<=s)
                left++;
            a[right]=a[left];
        }
        a[left]=s;
        kuaipai(a,start,left);
        kuaipai(a,left+1,end);
    }}
}
