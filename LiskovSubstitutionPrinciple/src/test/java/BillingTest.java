import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BillingTest {

    @Mock
    private PersonalLicense personalLicense;

    @Mock
    private BusinessLicense businessLicense;

    @Test
    @DisplayName("PersonalLicense 동작 확인")
    void test1() {
        //given
        License license = personalLicense;

        //when
        Billing billing = new Billing(license);
        billing.calc();

        //then
        verify(personalLicense, times(1)).calcFee();
        verify(businessLicense, never()).calcFee();
    }

    @Test
    @DisplayName("BusinessLicense 동작 확인")
    void test2() {

        //given
        License license = businessLicense;

        //when
        Billing billing = new Billing(license);
        billing.calc();

        //then
        verify(personalLicense, never()).calcFee();
        verify(businessLicense, times(1)).calcFee();

    }

}