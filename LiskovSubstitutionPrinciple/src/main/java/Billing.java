public class Billing {

    private final License license;

    public Billing(License license) {
        this.license = license;
    }

    public void calc() {
        license.calcFee();
    }
}
