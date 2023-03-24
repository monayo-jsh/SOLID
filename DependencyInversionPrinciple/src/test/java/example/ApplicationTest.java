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
    private Service service;

    @Mock
    private ServiceFactoryImpl serviceFactoryImpl;

    @Test
    void test1() {
        //given
        given(serviceFactoryImpl.makeSvc()).willReturn(service);

        //when
        Application application = new Application(serviceFactoryImpl);
        application.run();

        //then
        verify(serviceFactoryImpl, times(1)).makeSvc();
        verify(service, times(1)).method1();
        verify(service, times(1)).method2();
    }

}