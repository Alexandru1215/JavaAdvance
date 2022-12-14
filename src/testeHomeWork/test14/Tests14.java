package testeHomeWork.test14;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import testeHomeWork.test14.Challenge;

import static org.junit.Assert.assertThat;

public class Tests14 {
    @Test
    public void test1() {
        assertThat(Challenge.isEmpty(""), is(true));
    }

    @Test
    public void test2() {
        assertThat(Challenge.isEmpty(" "), is(false));
    }

    @Test
    public void test3() {
        assertThat(Challenge.isEmpty("            "), is(false));
    }

    @Test
    public void test4() {
        assertThat(Challenge.isEmpty("38215"), is(false));
    }

    @Test
    public void test5() {
        assertThat(Challenge.isEmpty("afjabsdf"), is(false));
    }

    @Test
    public void test6() {
        assertThat(Challenge.isEmpty("!?@&"), is(false));
    }
}