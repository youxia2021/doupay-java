package me.doupay.sdk.bean;

import java.util.List;

public class BillRecord {

    /**
     * total : 1
     * current : 1
     * hitCount : false
     * pages : 1
     * size : 10
     * optimizeCountSql : true
     * records : [{"userOrderCode":"202106281418537987786653","amount":0.01,"createTime":1624861134000,"tradingDirection":1,"orderStatus":3,"orderCode":"202106281417075369784839","coinCode":"0003","operateCode":"0005"}]
     * maxLimit : null
     * searchCount : true
     * orders : []
     * countId : null
     */

    private int total;
    private int current;
    private boolean hitCount;
    private int pages;
    private int size;
    private boolean optimizeCountSql;
    private Object maxLimit;
    private boolean searchCount;
    private Object countId;
    private List<RecordsBean> records;
    private List<?> orders;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean isHitCount() {
        return hitCount;
    }

    public void setHitCount(boolean hitCount) {
        this.hitCount = hitCount;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isOptimizeCountSql() {
        return optimizeCountSql;
    }

    public void setOptimizeCountSql(boolean optimizeCountSql) {
        this.optimizeCountSql = optimizeCountSql;
    }

    public Object getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(Object maxLimit) {
        this.maxLimit = maxLimit;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public Object getCountId() {
        return countId;
    }

    public void setCountId(Object countId) {
        this.countId = countId;
    }

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public List<?> getOrders() {
        return orders;
    }

    public void setOrders(List<?> orders) {
        this.orders = orders;
    }

    public static class RecordsBean {
        /**
         * userOrderCode : 202106281418537987786653
         * amount : 0.01
         * createTime : 1624861134000
         * tradingDirection : 1
         * orderStatus : 3
         * orderCode : 202106281417075369784839
         * coinCode : 0003
         * operateCode : 0005
         */

        private String userOrderCode;
        private double amount;
        private long createTime;
        private int tradingDirection;
        private int orderStatus;
        private String orderCode;
        private String coinCode;
        private String operateCode;

        public String getUserOrderCode() {
            return userOrderCode;
        }

        public void setUserOrderCode(String userOrderCode) {
            this.userOrderCode = userOrderCode;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getTradingDirection() {
            return tradingDirection;
        }

        public void setTradingDirection(int tradingDirection) {
            this.tradingDirection = tradingDirection;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getCoinCode() {
            return coinCode;
        }

        public void setCoinCode(String coinCode) {
            this.coinCode = coinCode;
        }

        public String getOperateCode() {
            return operateCode;
        }

        public void setOperateCode(String operateCode) {
            this.operateCode = operateCode;
        }
    }

    @Override
    public String toString() {
        return "BillRecord{" +
                "total=" + total +
                ", current=" + current +
                ", hitCount=" + hitCount +
                ", pages=" + pages +
                ", size=" + size +
                ", optimizeCountSql=" + optimizeCountSql +
                ", maxLimit=" + maxLimit +
                ", searchCount=" + searchCount +
                ", countId=" + countId +
                ", records=" + records +
                ", orders=" + orders +
                '}';
    }
}
