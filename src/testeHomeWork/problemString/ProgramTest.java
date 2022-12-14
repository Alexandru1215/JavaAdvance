package testeHomeWork.problemString;

import org.junit.Test;
import testeHomeWork.problemString.Program;

import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void test1() {
        assertEquals(8, Program.length("shipment"));
    }

    @Test
    public void test2() {
        assertEquals(5, Program.length("apple"));
    }

    @Test
    public void test3() {
        assertEquals(4, Program.length("make"));
    }

    @Test
    public void test4() {
        assertEquals(1, Program.length("a"));
    }

    @Test
    public void test5() {
        assertEquals(0, Program.length(""));
    }
}