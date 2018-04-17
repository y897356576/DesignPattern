package stonesStrict.pattern_observer.subject;

import stonesStrict.pattern_observer.observers.Observer;

/**
 * Created by admin on 2018/4/17.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
