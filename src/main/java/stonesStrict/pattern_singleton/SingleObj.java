package stonesStrict.pattern_singleton;

/**
 * Created by admin on 2018/4/20.
 */
public class SingleObj {

    private static SingleObj obj;

    private SingleObj() {}

    public static SingleObj getSingleObj() {
        if (obj != null) {
            return obj;
        }

        synchronized (obj) {
            if (obj == null) {
                obj = new SingleObj();
            }
            return obj;
        }
    }
}
