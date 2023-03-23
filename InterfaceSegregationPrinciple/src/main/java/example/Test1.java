package example;

public class Test1 {

    private final Test1Ops test1Ops;

    public Test1(Test1Ops test1Ops) {
        this.test1Ops = test1Ops;
    }

    public void run() {
        test1Ops.ops1();
    }
}
