package isp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class User1Test {

    @Test
    void test() {

        //User1에 U1Ops의 구현체인 OPS를 주입
        User1 user1 = new User1(new OPS());

        user1.run();

    }

}