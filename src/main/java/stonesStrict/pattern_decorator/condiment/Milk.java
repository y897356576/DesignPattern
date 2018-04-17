package stonesStrict.pattern_decorator.condiment;


import stonesStrict.pattern_decorator.Beverage;
import stonesStrict.pattern_decorator.CondimentDecorator;

/**
 * Created by admin on 2018/4/12.
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mile";
    }

    @Override
    public Double cost() {
        return .10 + beverage.cost();
    }
}
