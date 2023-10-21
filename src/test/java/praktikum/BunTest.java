package praktikum;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static praktikum.Constant.*;
import static praktikum.Message.*;


public class BunTest {
    private Bun bun;

    @Before
    public  void newBun(){
        bun = new Bun(BLACK_BUN, BLACK_PRICE);
    }

    @Test
    public void getNamePositiveTest(){
        assertEquals(WRONG_NAME_MSG, BLACK_BUN,bun.getName());
    }

    @Test
    public  void getPricePositiveTest(){
        assertEquals(WRONG_PRICE_MSG, BLACK_PRICE, bun.getPrice(),DELTA);
    }

    @Test
    public void getNameNegativeTest (){
        assertNotEquals(FAKE_EQUAL_NAME_MSG, FAKE_NAME,bun.getName());
    }
    @Test
    public void getPriceNegativeTest(){
        assertNotEquals(FAKE_EQUAL_PRICE_MSG, FAKE_PRICE,bun.getPrice());
    }

}
