package stonesStrict.pattern_decorator.condiment;

import stonesStrict.pattern_decorator.Beverage;
import stonesStrict.pattern_decorator.CondimentDecorator;

/**
 * Created by admin on 2018/4/12.
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public Double cost() {
        return .10 + beverage.cost();
    }
}
