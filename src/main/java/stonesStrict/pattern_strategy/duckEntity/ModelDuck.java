package stonesStrict.pattern_strategy.duckEntity;

import stonesStrict.pattern_strategy.Duck;
import stonesStrict.pattern_strategy.flyBehavior.FlyNoWay;
import stonesStrict.pattern_strategy.quackBehavior.Quack;

/**
 * Created by admin on 2018/4/17.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model duck.");
    }

}
