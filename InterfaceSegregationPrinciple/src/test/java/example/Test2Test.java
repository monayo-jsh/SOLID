package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class Test2Test {

    @Test
    void test1() {

        Test2 test2 = new Test2(new Test2OpsImpl());

        test2.run();

    }
}