package stonesStrict.pattern_observer.observers;

import stonesStrict.pattern_observer.subject.Subject;

/**
 * Created by admin on 2018/4/17.
 */
public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "°C degrees and " + humidity + "% humidity");
    }

    @Override
    public void cancellation() {
        weatherData.removeObserver(this);
    }
}
