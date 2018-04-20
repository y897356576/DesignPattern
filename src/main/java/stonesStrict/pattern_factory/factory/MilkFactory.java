package stonesStrict.pattern_factory.factory;

import stonesStrict.pattern_factory.product.*;

/**
 * Created by 石头 on 2018/4/15.
 */
public class MilkFactory {

    public static Milk getMengniu() {
        return new Mengniu();
    }

    public static Milk getYili() {
        return new Yili();
    }

    public static Milk getSanyuan() {
        return new Sanyuan();
    }

    public static Milk getTelunsu() {
        return new Telunsu();
    }

}
