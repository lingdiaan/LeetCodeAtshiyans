package Buffer;

import java.nio.ShortBuffer;

public class GetBufferRead {
    public static void main(String[] args) {
        ShortBuffer sb = ShortBuffer.allocate(1024);
        sb.put((short) 24);


    }
    public static void getMessage(String s ){
        System.out.println(s);
    }
}
