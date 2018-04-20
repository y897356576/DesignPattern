package stonesStrict.pattern_factory.factory.factoryMethod;

import stonesStrict.pattern_factory.product.Mengniu;
import stonesStrict.pattern_factory.product.Milk;

/**
 * Created by admin on 2018/4/20.
 */
public class MengniuFactory implements MilkFactoryMethod {

    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
