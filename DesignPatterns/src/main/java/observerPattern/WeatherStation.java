package observerPattern;

import org.testng.annotations.Test;

public class WeatherStation {
    @Test
    public void main() {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions(weatherData);

        weatherData.setMeasurements(32, 45, 13);
        weatherData.setMeasurements(11, 30, 20);
        weatherData.setMeasurements(40, 15, 50);
    }
}
