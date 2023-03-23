package isp;

public class User1 {

    private final U1Ops u1Ops;

    public User1(U1Ops u1Ops) {
        this.u1Ops = u1Ops;
    }

    public void run() {
        u1Ops.op1();
    }

}
