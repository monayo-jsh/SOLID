package not;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class User1Test {

    @Test
    void test1() {
        User1 user1 = new User1();

        user1.op1();
        user1.op2();
        user1.op3();
    }
}
