package stonesStrict.pattern_strategy.duck.duckEntity;

import stonesStrict.pattern_strategy.duck.Duck;
import stonesStrict.pattern_strategy.duck.flyBehavior.FlyNoWay;
import stonesStrict.pattern_strategy.duck.quackBehavior.Quack;

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
