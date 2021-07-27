package me.doupay.sdk.bean;

public class RefundResponseData {

    /**
     * orderCode :
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
        return "RefundResponseData{" +
                "orderCode='" + orderCode + '\'' +
                '}';
    }
}
