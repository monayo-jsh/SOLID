package example;

public class Test2 {

    private final Test2Ops test2Ops;

    public Test2(Test2Ops test2Ops) {
        this.test2Ops = test2Ops;
    }

    public void run() {
        test2Ops.ops2();
    }

}
