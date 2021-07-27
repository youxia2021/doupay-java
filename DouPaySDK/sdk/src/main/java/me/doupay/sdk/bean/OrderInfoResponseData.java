package me.doupay.sdk.bean;

import java.util.List;

public class OrderInfoResponseData {


    /**
     * amount :
     * amountPaid :
     * amountRefunded :
     * amountSettle :
     * appId :
     * body :
     * code :
     * coinCode :
     * coinName
     * currency :
     * description :
     * expireTime :
     * feeRate :
     * merchantName :
     * money :
     * orderNo :
     * orderTime :
     * orderType :
     * paid : true
     * paidTime :
     * paymentInfo : [{"chainInfos":[{"address":"","amount":0,"chainCoinCode":"","chainCoinName":"","exchangeRate":0,"isDefault":0,"paymentStatus":0,"protocolName":""}],"coinCode":"","coinName":"","isDefault":0}]
     * refunded : true
     * reversed : true
     * settleTime :
     * subject :
     */

    private String amount;
    private String amountPaid;
    private String amountRefunded;
    private String amountSettle;
    private String appId;
    private String body;
    private String code;
    private String coinName;
    private String currency;
    private String description;
    private String expireTime;
    private String feeRate;
    private String merchantName;
    private String money;
    private String orderNo;
    private String orderTime;
    private String orderType;
    private boolean paid;
    private String paidTime;
    private boolean refunded;
    private boolean reversed;
    private String settleTime;
    private String subject;
    private List<PaymentInfoBean> paymentInfo;

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

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(String amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public String getAmountSettle() {
        return amountSettle;
    }

    public void setAmountSettle(String amountSettle) {
        this.amountSettle = amountSettle;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime;
    }

    public boolean isRefunded() {
        return refunded;
    }

    public void setRefunded(boolean refunded) {
        this.refunded = refunded;
    }

    public boolean isReversed() {
        return reversed;
    }

    public void setReversed(boolean reversed) {
        this.reversed = reversed;
    }

    public String getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<PaymentInfoBean> getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(List<PaymentInfoBean> paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public static class PaymentInfoBean {
        /**
         * chainInfos : [{"address":"","amount":0,"chainCoinCode":"","chainCoinName":"","exchangeRate":0,"isDefault":0,"paymentStatus":0,"protocolName":""}]
         * coinCode :
         * coinName :
         * isDefault : 0
         */

        private String coinName;
        private int isDefault;
        private List<ChainInfosBean> chainInfos;

        public String getCoinName() {
            return coinName;
        }

        @Override
        public String toString() {
            return "PaymentInfoBean{" +
                    "coinName='" + coinName + '\'' +
                    ", isDefault=" + isDefault +
                    ", chainInfos=" + chainInfos +
                    '}';
        }

        public void setCoinName(String coinName) {
            this.coinName = coinName;
        }

        public int getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(int isDefault) {
            this.isDefault = isDefault;
        }

        public List<ChainInfosBean> getChainInfos() {
            return chainInfos;
        }

        public void setChainInfos(List<ChainInfosBean> chainInfos) {
            this.chainInfos = chainInfos;
        }

        public static class ChainInfosBean {
            /**
             * address :
             * amount : 0
             * chainCoinCode :
             * chainCoinName :
             * exchangeRate : 0
             * isDefault : 0
             * paymentStatus : 0
             * protocolName :
             */

            private String address;
            private String amount;
            private String chainCoinCode;
            private String chainCoinName;
            private String price;
            private int isDefault;
            private int paymentStatus;
            private String protocolName;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getChainCoinCode() {
                return chainCoinCode;
            }

            public void setChainCoinCode(String chainCoinCode) {
                this.chainCoinCode = chainCoinCode;
            }

            public String getChainCoinName() {
                return chainCoinName;
            }

            public void setChainCoinName(String chainCoinName) {
                this.chainCoinName = chainCoinName;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            @Override
            public String toString() {
                return "ChainInfosBean{" +
                        "address='" + address + '\'' +
                        ", amount='" + amount + '\'' +
                        ", chainCoinCode='" + chainCoinCode + '\'' +
                        ", chainCoinName='" + chainCoinName + '\'' +
                        ", price='" + price + '\'' +
                        ", isDefault=" + isDefault +
                        ", paymentStatus=" + paymentStatus +
                        ", protocolName='" + protocolName + '\'' +
                        '}';
            }

            public int getIsDefault() {
                return isDefault;
            }

            public void setIsDefault(int isDefault) {
                this.isDefault = isDefault;
            }

            public int getPaymentStatus() {
                return paymentStatus;
            }

            public void setPaymentStatus(int paymentStatus) {
                this.paymentStatus = paymentStatus;
            }

            public String getProtocolName() {
                return protocolName;
            }

            public void setProtocolName(String protocolName) {
                this.protocolName = protocolName;
            }
        }
    }

    @Override
    public String toString() {
        return "OrderInfoResponseData{" +
                "amount='" + amount + '\'' +
                ", amountPaid='" + amountPaid + '\'' +
                ", amountRefunded='" + amountRefunded + '\'' +
                ", amountSettle='" + amountSettle + '\'' +
                ", appId='" + appId + '\'' +
                ", body='" + body + '\'' +
                ", code='" + code + '\'' +
                ", coinName='" + coinName + '\'' +
                ", currency='" + currency + '\'' +
                ", description='" + description + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", feeRate='" + feeRate + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", money='" + money + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderType='" + orderType + '\'' +
                ", paid=" + paid +
                ", paidTime='" + paidTime + '\'' +
                ", refunded=" + refunded +
                ", reversed=" + reversed +
                ", settleTime='" + settleTime + '\'' +
                ", subject='" + subject + '\'' +
                ", paymentInfo=" + paymentInfo +
                '}';
    }
}
