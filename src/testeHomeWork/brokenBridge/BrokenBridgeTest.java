package testeHomeWork.brokenBridge; /**
 =====================================
 TestGen 4.0 for JUnit 4.13.0
 Test Case: BrokenBridge::isSafeBridge
 Timestamp: 10/15/2020 12:54:46 PM
 -------------------------------------
 ® DARKKO 2020 ©
 =====================================

 **/

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import testeHomeWork.brokenBridge.BrokenBridge;

public class BrokenBridgeTest {

    @Test
    public void test01() {
        assertEquals(true, BrokenBridge.isSafeBridge("####"));
    }

    @Test
    public void test02() {
        assertEquals(false, BrokenBridge.isSafeBridge("###### ### ##"));
    }

    @Test
    public void test03() {
        assertEquals(true, BrokenBridge.isSafeBridge("#"));
    }

    @Test
    public void test04() {
        assertEquals(false, BrokenBridge.isSafeBridge("# #"));
    }

    @Test
    public void test05() {
        assertEquals(true, BrokenBridge.isSafeBridge("######"));
    }

    @Test
    public void test06() {
        assertEquals(true, BrokenBridge.isSafeBridge("#########"));
    }

    @Test
    public void test07() {
        assertEquals(false, BrokenBridge.isSafeBridge("### ###"));
    }

    @Test
    public void test08() {
        assertEquals(true, BrokenBridge.isSafeBridge("#####"));
    }

    @Test
    public void test09() {
        assertEquals(false, BrokenBridge.isSafeBridge("### # ###"));
    }

    @Test
    public void test10() {
        assertEquals(true, BrokenBridge.isSafeBridge("###"));
    }

    @Test
    public void test11() {
        assertEquals(false, BrokenBridge.isSafeBridge("# ### #"));
    }

    @Test
    public void test12() {
        assertEquals(true, BrokenBridge.isSafeBridge("#####"));
    }

}
// end of tests
// credit goes to the original author/publisher @Joshua Señoron