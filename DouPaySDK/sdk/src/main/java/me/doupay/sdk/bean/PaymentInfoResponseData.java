package me.doupay.sdk.bean;

import java.util.List;

public class PaymentInfoResponseData {


    /**
     * address :
     * amount :
     * chainCoinCode :
     * chainCoinName :
     * exchangeRate :
     * isDefault : 0
     * paymentMethods : [{"channelList":[{"icon":"","link":"","name":"","remark":""}],"paymentMethodCode":"","paymentMethodName":""}]
     * paymentStatus : 0
     * protocolName :
     */

    private String address;
    private String amount;
    private String chainCoinCode;
    private String chainCoinName;
    private String exchangeRate;
    private int isDefault;
    private int paymentStatus;
    private String protocolName;
    private List<PaymentMethodsBean> paymentMethods;

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

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
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

    public List<PaymentMethodsBean> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethodsBean> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public static class PaymentMethodsBean {
        /**
         * channelList : [{"icon":"","link":"","name":"","remark":""}]
         * paymentMethodCode :
         * paymentMethodName :
         */

        private String paymentMethodCode;
        private String paymentMethodName;
        private List<ChannelListBean> channelList;

        public String getPaymentMethodCode() {
            return paymentMethodCode;
        }

        public void setPaymentMethodCode(String paymentMethodCode) {
            this.paymentMethodCode = paymentMethodCode;
        }

        public String getPaymentMethodName() {
            return paymentMethodName;
        }

        public void setPaymentMethodName(String paymentMethodName) {
            this.paymentMethodName = paymentMethodName;
        }

        public List<ChannelListBean> getChannelList() {
            return channelList;
        }

        public void setChannelList(List<ChannelListBean> channelList) {
            this.channelList = channelList;
        }

        public static class ChannelListBean {
            /**
             * icon :
             * link :
             * name :
             * remark :
             */

            private String icon;
            private String link;
            private String name;
            private String remark;

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }
        }

        @Override
        public String toString() {
            return "PaymentMethodsBean{" +
                    "paymentMethodCode='" + paymentMethodCode + '\'' +
                    ", paymentMethodName='" + paymentMethodName + '\'' +
                    ", channelList=" + channelList +
                    '}';
        }
    }
}
