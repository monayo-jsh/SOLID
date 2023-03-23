import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class BillingTest {

    @Test
    @DisplayName("PersonalLicense 동작 확인")
    void test1() {
        License license = new PersonalLicense();
        Billing billing = new Billing(license);

        billing.calc();
    }

    @Test
    @DisplayName("BusinessLicense 동작 확인")
    void test2() {
        License license = new BusinessLicense();
        Billing billing = new Billing(license);

        billing.calc();
    }

}