package testeHomeWork.test13;

import org.junit.Test;
import testeHomeWork.test13.Challenge;

import static org.junit.Assert.assertEquals;

public class Tests13 {
    @Test
    public void test1() {
        assertEquals("Doe, John", Challenge.concatName("John", "Doe"));
    }

    @Test
    public void test2() {
        assertEquals("Last, First", Challenge.concatName("First", "Last"));
    }

    @Test
    public void test3() {
        assertEquals("B, A", Challenge.concatName("A", "B"));
    }

    @Test
    public void test4() {
        assertEquals(",, ,", Challenge.concatName(",", ","));
    }
}