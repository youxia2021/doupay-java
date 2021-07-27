package me.doupay.sdk.bean;

public class CoinPriceResponse {


    /**
     * amount :
     * coinName :
     * currency :
     * money :
     * payType :
     * price :
     */

    private String amount;
    private String coinName;
    private String currency;
    private String money;
    private String payType;
    private String price;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CoinPriceResponse{" +
                "amount='" + amount + '\'' +
                ", coinName='" + coinName + '\'' +
                ", currency='" + currency + '\'' +
                ", money='" + money + '\'' +
                ", payType='" + payType + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
