package stonesStrict.pattern_strategy.pay.payProcessor;

/**
 * Created by admin on 2018/4/23.
 */
public enum ProcessorEnum {
    ALI_PAY("支付宝", "支付宝支付接口"),
    WECHAT_PAY("微信支付", "微信支付接口");

    private String payName;

    private String payDescribe;

    ProcessorEnum(String payName, String payDescribe) {
        this.payName = payName;
        this.payDescribe = payDescribe;
    }
}
