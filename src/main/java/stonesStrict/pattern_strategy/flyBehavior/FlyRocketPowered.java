package stonesStrict.pattern_strategy.flyBehavior;

/**
 * Created by admin on 2018/4/17.
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }

}
