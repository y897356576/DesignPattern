package stonesStrict.pattern_strategy.flyBehavior;

/**
 * Created by admin on 2018/4/17.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }

}
