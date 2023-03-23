package isp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class User3Test {

    @Test
    void test() {

        //User3에 U3Ops의 구현체인 OPS를 주입
        User3 user3 = new User3(new OPS());

        user3.run();

    }

}