package stonesStrict.pattern_decorator.beverage;

import stonesStrict.pattern_decorator.Beverage;

/**
 * Created by admin on 2018/4/12.
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}
