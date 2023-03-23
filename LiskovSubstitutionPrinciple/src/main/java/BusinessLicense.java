import java.util.List;

public class BusinessLicense implements License {

    //License 하위 타입

    private List<String> users;

    @Override
    public void calcFee() {
        System.out.println("BusinessLicense.calcFee()");
    }
}
