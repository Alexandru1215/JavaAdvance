package testeHomeWork.isEqual;

import org.junit.Test;
import testeHomeWork.isEqual.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.isEqual(2, 2));
    }

    @Test
    public void test2() {
        assertEquals(true, Challenge.isEqual(88, 88));
    }

    @Test
    public void test3() {
        assertEquals(false, Challenge.isEqual(36, 35));
    }

    @Test
    public void test4() {
        assertEquals(true, Challenge.isEqual(1, 1));
    }

    @Test
    public void test5() {
        assertEquals(false, Challenge.isEqual(5, 6));
    }
}