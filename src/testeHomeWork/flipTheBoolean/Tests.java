package testeHomeWork.flipTheBoolean;

import org.junit.Test;
import testeHomeWork.flipTheBoolean.Challenge;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test1() {
        assertEquals(true, Challenge.reverse(false));
    }

    @Test
    public void test2() {
        assertEquals(false, Challenge.reverse(true));
    }
}