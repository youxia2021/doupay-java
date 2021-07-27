package me.doupay.sdk.bean;

import java.util.List;

public class CurrencyResponseData {

    private List<RecordsBean> records;

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public static class RecordsBean {
        /**
         * isDefault : 0
         * name : 美元
         * currency : USA
         */

        private int isDefault;
        private String name;
        private String currency;

        public int getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(int isDefault) {
            this.isDefault = isDefault;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        @Override
        public String toString() {
            return "RecordsBean{" +
                    "isDefault=" + isDefault +
                    ", name='" + name + '\'' +
                    ", currency='" + currency + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CurrencyResponseData{" +
                "records=" + records +
                '}';
    }
}
