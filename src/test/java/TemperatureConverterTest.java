import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {
    private static final TemperatureConverter tc = new TemperatureConverter();

    @AfterClass
    public static void afterClass() {
        System.out.println("Veera Ruotsalainen");
    }

    @Test
    public void fahrenheitToCelsius() {
        assertEquals(0.0, tc.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, tc.fahrenheitToCelsius(212), 0.001);
        assertEquals(-40.0, tc.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
    public void celsiusToFahrenheit() {
        assertEquals(32.0, tc.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, tc.celsiusToFahrenheit(100), 0.001);
        assertEquals(-40.0, tc.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    public void isExtremeTemperature() {
        assertTrue(tc.isExtremeTemperature(-45));
        assertTrue(tc.isExtremeTemperature(55));
        assertFalse(tc.isExtremeTemperature(20));
        assertFalse(tc.isExtremeTemperature(-39));
    }
}