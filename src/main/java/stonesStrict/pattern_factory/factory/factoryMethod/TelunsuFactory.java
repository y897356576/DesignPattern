package stonesStrict.pattern_factory.factory.factoryMethod;

import stonesStrict.pattern_factory.product.Milk;
import stonesStrict.pattern_factory.product.Telunsu;

/**
 * Created by 石头 on 2018/4/15.
 */
public class TelunsuFactory implements MilkFactoryMethod {

    @Override
    public Milk getMilk() {
        return new Telunsu();
    }

}
