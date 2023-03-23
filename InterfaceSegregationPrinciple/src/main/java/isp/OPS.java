package isp;

public class OPS implements U1Ops, U2Ops, U3Ops {

    @Override
    public void op1() {
        System.out.println("isp.OPS.op1()");
    }

    @Override
    public void op2() {
        System.out.println("isp.OPS.op2()");
    }

    @Override
    public void op3() {
        System.out.println("isp.OPS.op3()");
    }

}
