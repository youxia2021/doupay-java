package me.doupay.sdk.bean;

public class WithdrawResponse {


    /**
     * orderCode : TX202107091032171837278538
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
        return "WithdrawResponse{" +
                "orderCode='" + orderCode + '\'' +
                '}';
    }
}
