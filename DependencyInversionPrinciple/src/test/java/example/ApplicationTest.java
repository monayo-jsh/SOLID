package example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ApplicationTest {

    @Mock
    private ConcreteImpl concreteImpl;

    @Mock
    private ServiceFactoryImpl serviceFactoryImpl;

    @Test
    void test1() {
        //given
        given(serviceFactoryImpl.makeSvc()).willReturn(concreteImpl);

        //when
        Application application = new Application(serviceFactoryImpl);
        application.run();

        //then
        verify(serviceFactoryImpl, times(1)).makeSvc();
        verify(concreteImpl, times(1)).method1();
        verify(concreteImpl, times(1)).method2();
    }

}