package stonesStrict.pattern_observer.observers;

import stonesStrict.pattern_observer.subject.Subject;

/**
 * Created by admin on 2018/4/17.
 */
public class PressureDisplay implements Observer, Display {

    private float pressure;

    private Subject weatherData;

    public PressureDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;

        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current pressure:" + pressure);
    }

    @Override
    public void cancellation() {
        weatherData.removeObserver(this);
    }
}
