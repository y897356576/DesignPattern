package stonesStrict.pattern_factory.factory;

import stonesStrict.pattern_factory.product.Milk;
import stonesStrict.pattern_factory.product.Telunsu;

/**
 * Created by 石头 on 2018/4/15.
 */
public class TelunsuFactory {

    public static Milk getMilk() {
        return new Telunsu();
    }

}
