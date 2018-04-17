package stonesStrict.pattern_observer.observers;

/**
 * Created by admin on 2018/4/17.
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

    void cancellation();

}
