import lombok.AllArgsConstructor;
import lombok.Data;
import pojo.People;

import java.io.*;

public class SerializeTest implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("single.txt"));
//        o.writeObject(new Man("施英杰"));
//        o.close();

        ObjectInputStream o = new ObjectInputStream(new FileInputStream("single.txt"));
        Object c = o.readObject();
        o.close();
        System.out.println(c);
    }
}
@Data
@AllArgsConstructor
class Man implements Serializable{
    private String name;

}
