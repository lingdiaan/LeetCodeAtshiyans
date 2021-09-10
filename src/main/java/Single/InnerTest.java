package Single;

public class InnerTest {
    private InnerTest(){}

    private InnerTest getInnerTest(){
        return InnerClass.inner;
    }

    private static class InnerClass{
        private static final InnerTest inner = new InnerTest();
    }

}
