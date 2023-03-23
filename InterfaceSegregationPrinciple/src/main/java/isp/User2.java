package isp;

public class User2 {

    private final U2Ops u2Ops;

    public User2(U2Ops u2Ops) {
        this.u2Ops = u2Ops;
    }

    public void run() {
        u2Ops.op2();
    }

}
