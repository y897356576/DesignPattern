package stonesStrict.pattern_observer.subject;

import stonesStrict.pattern_observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/4/17.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperatureOld;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (checkChanged()) {
            for (Observer observer : observers) {
                observer.update(temperature, humidity, pressure);
            }
        }
    }

    private Boolean checkChanged() {
        if (Math.abs(temperatureOld - this.temperature) >= 0.5) {
            return true;
        }
        return false;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperatureOld = this.temperature;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.notifyObservers();
    }
}
