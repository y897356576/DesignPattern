package stonesStrict.pattern_decorator;

/**
 * Created by admin on 2018/4/12.
 */
public abstract class Beverage {

    protected String description = "UnKnown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
