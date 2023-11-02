package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static praktikum.Constant.*;
import static praktikum.Message.*;

@RunWith(Parameterized.class)
public class BunParamTest {
    private final String name;
    private final float price;
    public BunParamTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Name bun: {0}")
    public static Object[][] bunParamTest() {
        return new Object[][]{
                {BLACK_BUN_ENG,BLACK_PRICE},
                {BLACK_BUN_RUS,BLACK_PRICE},
                {BLACK_BUN_NULL,BLACK_PRICE},
                {BLACK_BUN_ENG,NULL_PRICE},
                {BLACK_BUN_ENG,MINUS_PRICE},
        };
    }
    @Test

    public void getNameBunTest(){
        var bun = new Bun(name,price);
        assertEquals(WRONG_NAME_MSG, name,bun.getName());
    }

    @Test
    public  void getPriceBunTest(){
        var bun = new Bun(name,price);
        assertEquals(WRONG_PRICE_MSG, price,bun.getPrice(),DELTA);
    }
}
