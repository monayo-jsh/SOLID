package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class Test1Test {

    @Test
    void test1() {

        Test1 test1 = new Test1(new Test1OpsImpl());

        test1.run();

    }
}