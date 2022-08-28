package testeHomeWork.test6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test6 {
    @Test
    public void test1() {
        assertEquals(1, Program.flipIntBool(0));
    }

    @Test
    public void test2() {
        assertEquals(0, Program.flipIntBool(1));
    }
}