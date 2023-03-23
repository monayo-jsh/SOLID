public class PersonalLicense implements License {

    //License 하위 타입

    @Override
    public void calcFee() {
        System.out.println("PersonalLicense.calcFee()");
    }

}
