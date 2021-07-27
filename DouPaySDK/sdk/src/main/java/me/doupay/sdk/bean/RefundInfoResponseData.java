package me.doupay.sdk.bean;

import java.util.List;

public class RefundInfoResponseData {

    private List<RecordsBean> records;

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public static class RecordsBean {
        /**
         * amount : 0.02000000
         * address : TEQrvHyU54YibVHMGb7475n8y3mXBofaaR
         * refundStatus : 0
         * orderCode : ZF202106281454045820662888
         * remark : 退100元的
         * refundCode : TK202106281637051484618880
         */

        private String amount;
        private String address;
        private int refundStatus;
        private String orderCode;
        private String remark;
        private String refundCode;

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getRefundStatus() {
            return refundStatus;
        }

        public void setRefundStatus(int refundStatus) {
            this.refundStatus = refundStatus;
        }

        public String getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRefundCode() {
            return refundCode;
        }

        public void setRefundCode(String refundCode) {
            this.refundCode = refundCode;
        }

        @Override
        public String toString() {
            return "RecordsBean{" +
                    "amount='" + amount + '\'' +
                    ", address='" + address + '\'' +
                    ", refundStatus=" + refundStatus +
                    ", orderCode='" + orderCode + '\'' +
                    ", remark='" + remark + '\'' +
                    ", refundCode='" + refundCode + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "RefundInfoResponseData{" +
                "records=" + records +
                '}';
    }
}
