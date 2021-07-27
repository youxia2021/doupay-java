package me.doupay.sdk.bean;

import java.util.List;

public class CoinResponseData {

    private List<RecordsBean> records;

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public static class RecordsBean {
        /**
         * coinName : BTC
         * coinCode : 0001
         */

        private String coinName;
        private String coinCode;

        public String getCoinName() {
            return coinName;
        }

        public void setCoinName(String coinName) {
            this.coinName = coinName;
        }

        public String getCoinCode() {
            return coinCode;
        }

        public void setCoinCode(String coinCode) {
            this.coinCode = coinCode;
        }

        @Override
        public String toString() {
            return "RecordsBean{" +
                    "coinName='" + coinName + '\'' +
                    ", coinCode='" + coinCode + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CoinResponseData{" +
                "records=" + records +
                '}';
    }
}
