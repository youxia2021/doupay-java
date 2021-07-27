package me.doupay.sdk.bean;

public class PaymentCallBackResponse {

    /**
     * 支付订单号
     */
    private String orderCode;

    /**
     *币种名称
     */
    private String coinName;
    /**
     *地址
     */
    private String address;
    /**
     *支付数量
     */
    private String amountPaid;
    /**
     *协议名称
     */
    private String protocolName;
    /**
     *支付状态 0未付款 1正常付款 2少付 3多付
     */
    private Integer paymentStatus;
    /**
     *结果 true成功 false失败
     */
    private boolean result;

    /**
     *汇率
     */
    private String price;
    /**
     *金额
     */
    private String money;

    public PaymentCallBackResponse(String orderCode, String coinName, String address, String amountPaid, String protocolName, Integer paymentStatus, boolean result, String price,String money) {
        this.orderCode = orderCode;
        this.coinName = coinName;
        this.address = address;
        this.amountPaid = amountPaid;
        this.protocolName = protocolName;
        this.paymentStatus = paymentStatus;
        this.result = result;
        this.price = price;
        this.money = money;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "PaymentCallBackResponse{" +
                "orderCode='" + orderCode + '\'' +
                ", coinName='" + coinName + '\'' +
                ", address='" + address + '\'' +
                ", amountPaid='" + amountPaid + '\'' +
                ", protocolName='" + protocolName + '\'' +
                ", paymentStatus=" + paymentStatus +
                ", result=" + result +
                ", price='" + price + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
