package testeHomeWork.test12;

import org.junit.Test;
import testeHomeWork.test12.Program;

import static org.junit.Assert.assertEquals;

public class Test12 {
    @Test
    public void test1(){
        assertEquals("Hello, Matt!", Program.greeting("Matt"));
    }
    @Test
    public void test2(){
        assertEquals("Hello, Helen!", Program.greeting("Helen"));
    }
    @Test
    public void test3(){
        assertEquals("Hello, my Love!", Program.greeting("Mubashir"));
    }
}