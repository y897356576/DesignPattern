package stonesStrict.pattern_factory.factory;

import stonesStrict.pattern_factory.product.Mengniu;
import stonesStrict.pattern_factory.product.Milk;
import stonesStrict.pattern_factory.product.Sanyuan;
import stonesStrict.pattern_factory.product.Yili;

/**
 * Created by 石头 on 2018/4/15.
 */
public class MilkSimpleFactory {

    /**
     * 简单工厂模式
     * @return
     */
    public static Milk getMilk(String milkName) {
        if ("蒙牛".equals(milkName)) {
            return new Mengniu();
        } else if ("伊利".equals(milkName)) {
            return new Yili();
        } else if ("三元".equals(milkName)) {
            return new Sanyuan();
        } else {
            throw new RuntimeException("没有您需要的牛奶");
        }
    }

}
