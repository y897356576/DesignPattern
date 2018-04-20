package stonesStrict.pattern_factory.factory.factoryMethod;

import stonesStrict.pattern_factory.product.Milk;
import stonesStrict.pattern_factory.product.Sanyuan;

/**
 * Created by admin on 2018/4/20.
 */
public class SanyuanFactory implements MilkFactoryMethod {

    @Override
    public Milk getMilk() {
        return new Sanyuan();
    }
}
