import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before(){waterBottle = new WaterBottle(100);}

    @Test
    public void canDrinkWater(){
        assertEquals(90, waterBottle.getDrink());
    }
    @Test
    public void hasZeroVolume(){
        assertEquals(0, waterBottle.getZeroVolume());
    }
    @Test
    public void canFillUpWater(){
        assertEquals(100, waterBottle.fillUpWater());
    }



}
