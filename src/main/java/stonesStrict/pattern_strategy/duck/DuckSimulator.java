package stonesStrict.pattern_strategy.duck;

import stonesStrict.pattern_strategy.duck.duckEntity.MallardDuck;
import stonesStrict.pattern_strategy.duck.duckEntity.ModelDuck;
import stonesStrict.pattern_strategy.duck.flyBehavior.FlyRocketPowered;

/**
 * Created by admin on 2018/4/17.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        System.out.println("----------------");
        duck = new ModelDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }

}
