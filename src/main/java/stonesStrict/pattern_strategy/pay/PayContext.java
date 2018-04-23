package stonesStrict.pattern_strategy.pay;

/**
 * Created by admin on 2018/4/23.
 */
public class PayContext {

    private Double cent;    //金额

    private String msg;     //响应信息

    public Double getCent() {
        return cent;
    }

    public void setCent(Double cent) {
        this.cent = cent;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
