package testeHomeWork.test2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(3600, test2.convert(1, 0));
    }

    @Test
    public void test2() {
        assertEquals(3780, test2.convert(1, 3));
    }

    @Test
    public void test3() {
        assertEquals(1800, test2.convert(0, 30));
    }
}