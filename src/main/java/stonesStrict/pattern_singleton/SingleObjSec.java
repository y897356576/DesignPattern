package stonesStrict.pattern_singleton;

/**
 * Created by admin on 2018/4/20.
 */
public class SingleObjSec {

    private static SingleObjSec obj;

    private SingleObjSec() {}

    public static SingleObjSec getSingleObj() {
        if (obj != null) {
            return obj;
        }

        synchronized (obj) {
            if (obj == null) {
                obj = new SingleObjSec();
            }
            return obj;
        }
    }
}
