package JavaLesson2;

import JavaLesson2.TT2203;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTT2203 {
    private final TT2203 tt2203 = new TT2203();
    @Before public void generateDeck() throws Exception {
        tt2203.newDeck();
    }
    @Test
    public void test1() throws Exception {
        assertEquals("[♠A, ♠K, ♠Q, ♠J, ♠10, ♠9, ♠8, ♠7, ♠6, ♠5, ♠4, ♠3, ♠2, ♥A, ♥K, ♥Q, ♥J, ♥10, ♥9, ♥8, ♥7, ♥6, ♥5, ♥4, ♥3, ♥2, ♦A, ♦K, ♦Q, ♦J, ♦10, ♦9, ♦8, ♦7, ♦6, ♦5, ♦4, ♦3, ♦2, ♣A, ♣K, ♣Q, ♣J, ♣10, ♣9, ♣8, ♣7, ♣6, ♣5, ♣4, ♣3, ♣2]",tt2203.deck.toString());
    }

    @Test
    public void test2() throws Exception {
        assertEquals( 1,tt2203.comparison("♠10", "♦5"));
    }
    @Test
    public void test3() throws Exception {
        assertEquals( -1,tt2203.comparison("♦2", "♠J"));
    }
    @Test
    public void test4() throws Exception {
        assertEquals( 0,tt2203.comparison("♠Q", "♦Q"));
    }
    @Test
    public void test5() throws Exception {
        assertEquals( 0,tt2203.comparison("♣8", "♥8"));
    }

}
