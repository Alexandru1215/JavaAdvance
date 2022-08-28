package testeHomeWork.test4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {


    @Test
    public void test1() {
        assertEquals(true, test4.reverse(false));
    }

    @Test
    public void test2() {
        assertEquals(false, test4.reverse(true));
    }
}