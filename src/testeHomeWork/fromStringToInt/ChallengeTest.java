package testeHomeWork.fromStringToInt;

import org.junit.Test;
import testeHomeWork.fromStringToInt.Challenge;

import static org.junit.Assert.assertEquals;

public class ChallengeTest {

    @Test
    public void test1(){
        int expected = 6;
        int actual = Challenge.stringInt("6");
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int expected = 2;
        int actual = Challenge.stringInt("2");
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int expected = 10;
        int actual = Challenge.stringInt("10");
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        int expected = 666;
        int actual = Challenge.stringInt("666");
        assertEquals(expected, actual);
    }
}