package Bridge;

public class Test {
    public static void main(String[] args) {
        Computer computer = new DeskTop(new Lenovo());
        computer.info();
        Computer c2 = new LapTop(new MacBook());
        c2.info();
    }
}
