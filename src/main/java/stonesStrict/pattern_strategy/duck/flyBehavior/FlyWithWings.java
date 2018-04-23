package stonesStrict.pattern_strategy.duck.flyBehavior;

/**
 * Created by admin on 2018/4/17.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }

}
