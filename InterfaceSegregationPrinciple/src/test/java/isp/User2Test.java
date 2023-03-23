package isp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class User2Test {
    @Test
    void test() {

        //User2에 U2Ops의 구현체인 OPS를 주입
        User2 user2 = new User2(new OPS());

        user2.run();

    }
}