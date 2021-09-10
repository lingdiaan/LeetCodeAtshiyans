import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class User {
    private  String name;
    private  int age;
    @Autowired
    private Dog dog;


}
