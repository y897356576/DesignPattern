package stonesStrict.pattern_strategy.duck.duckEntity;

import stonesStrict.pattern_strategy.duck.Duck;
import stonesStrict.pattern_strategy.duck.flyBehavior.FlyWithWings;
import stonesStrict.pattern_strategy.duck.quackBehavior.Quack;

/**
 * Created by admin on 2018/4/17.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
