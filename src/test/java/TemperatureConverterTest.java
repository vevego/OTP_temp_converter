

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class TemperatureConverterTest {
    // initial method
    @Test
    void convertFahr() {
        int test = (TemperatureConverter.convertFahr(32));

        assertEquals(0, test);

    }


    // Add in the class demo
    @Test
    void convertCel(){
        int test= (TemperatureConverter.convertCel(20));
        assertEquals(68,test);
    }

    // Inclass exercise
    @Test
    void convertKel(){
        int test= (TemperatureConverter.kelvintoCel(273));
        assertEquals(0,test);
    }

    @Test
    void convertKeltoFarTest() {
        double test =Math.round(TemperatureConverter.kelvinToFah(300.1));
        assertEquals(59.0, test);
    }
}