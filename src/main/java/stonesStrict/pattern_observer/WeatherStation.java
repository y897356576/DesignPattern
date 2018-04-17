package stonesStrict.pattern_observer;

import stonesStrict.pattern_observer.observers.CurrentConditionsDisplay;
import stonesStrict.pattern_observer.observers.PressureDisplay;
import stonesStrict.pattern_observer.subject.WeatherData;

/**
 * Created by admin on 2018/4/17.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        weatherData.setMeasurements(29f, 65, 30.4f);
        weatherData.setMeasurements(29.3f, 65, 30.4f);
        weatherData.setMeasurements(32f, 70, 29.2f);
        weatherData.setMeasurements(31.8f, 70, 29.2f);
        weatherData.setMeasurements(26f, 90, 29.2f);
    }

}
