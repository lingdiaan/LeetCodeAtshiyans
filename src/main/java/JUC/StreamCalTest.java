package JUC;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

public class StreamCalTest {
    public static void main(String[] args) {
        User user1 = new User(1,23,"shi1");
        User user2 = new User(7,27,"shi2");
        User user3 = new User(4,26,"shi3");
        User user4 = new User(5,34,"shi4");
        User user5 = new User(2,25,"shi5");
        User user6 = new User(6,32,"shi6");
        User user7 = new User(8,44,"J");

        List<User> user = Arrays.asList(user1,user2,user3,user6,user4,user5,user7);
        user.stream()
                .filter(u->{return u.getId()%2==0;})
                .filter(u->{return u.getAge()>27;})
                .map(u->{return u.getName().toUpperCase(Locale.ROOT);})
                .sorted((u1,u2)->{return u1.compareTo(u2);
                })
                .forEach(System.out::println);
    }
}
@Data
@AllArgsConstructor
class User{
    int id;
    int age;
    String name;
        }
