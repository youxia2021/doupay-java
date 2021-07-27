package me.doupay.sdk.bean;

public class PayResponseData {
    /*
    服务订单号
     */
    private String orderCode;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    @Override
    public String toString() {
        return "PayResponseData{" +
                "orderCode='" + orderCode + '\'' +
                '}';
    }
}
