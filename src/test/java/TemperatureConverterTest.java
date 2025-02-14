

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class TemperatureConverterTest {
    // initial method
    @Test
    void convertFahrenheit() {
        int test = (TemperatureConverter.farenheitToCelcius(32));

        assertEquals(0, test);

    }


    // Add in the class demo
    @Test
    void convertCelsius(){
        int test= (TemperatureConverter.celsiusToFarenheit(20));
        assertEquals(68,test);
    }


    @Test
    void isExtremeTemperature(){
        boolean test= (TemperatureConverter.isExtremeTemperature(-45));
        assertEquals(true,test);
    }
}