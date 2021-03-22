package JavaLesson1;

import JavaLesson1.TT1503;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTT1503 {

    private final TT1503 tt1503 = new TT1503();

    @Test
    public void test1() throws Exception {
        assertEquals(5,tt1503.toInteger("5"));
    }
    @Test
    public void test2() throws Exception {
        assertEquals(3489,tt1503.toInteger("3489"));
    }
    @Test
    public void test3() throws Exception {
        assertEquals(-637,tt1503.toInteger("-637"));
    }
    @Test
    public void test4() throws Exception {
        assertEquals(0,tt1503.toInteger("57394k9845"));
    }
    @Test
    public void test5() throws Exception {
        assertEquals(0,tt1503.toInteger(""));
    }
    @Test
    public void test6() throws Exception {
        assertEquals(0,tt1503.toInteger("hello world!"));
    }
    @Test
    public void test7() throws Exception {
        assertEquals(0,tt1503.toInteger("0"));
    }

    @Test
    public void test9() throws Exception {
        assertEquals(1,tt1503.reverseAndToInteger("1"));
    }
    @Test
    public void test10() throws Exception {
        assertEquals(54321,tt1503.reverseAndToInteger("12345"));
    }
    @Test
    public void test11() throws Exception {
        assertEquals(1001,tt1503.reverseAndToInteger("1001"));
    }
    @Test
    public void test12() throws Exception {
        assertEquals(0,tt1503.reverseAndToInteger(""));
    }
    @Test
    public void test13() throws Exception {
        assertEquals(0,tt1503.reverseAndToInteger("hello world"));
    }

}
