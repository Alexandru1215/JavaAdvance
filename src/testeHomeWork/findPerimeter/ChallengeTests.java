package testeHomeWork.findPerimeter;

import org.junit.Test;
import testeHomeWork.findPerimeter.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(26, Challenge.findPerimeter(6, 7));
    }

    @Test
    public void test2() {
        assertEquals(60, Challenge.findPerimeter(20, 10));
    }

    @Test
    public void test3() {
        assertEquals(22, Challenge.findPerimeter(2, 9));
    }
}