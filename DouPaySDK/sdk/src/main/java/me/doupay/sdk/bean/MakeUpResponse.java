package me.doupay.sdk.bean;

public class MakeUpResponse {


    /**
     * appId :
     * orderCode :
     * userId : 0
     */

    private String appId;
    private String orderCode;
    private int userId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "MakeUpResponse{" +
                "appId='" + appId + '\'' +
                ", orderCode='" + orderCode + '\'' +
                ", userId=" + userId +
                '}';
    }
}
