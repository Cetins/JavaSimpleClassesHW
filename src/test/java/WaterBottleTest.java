import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void isVolumeStarts100() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFill() {
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
