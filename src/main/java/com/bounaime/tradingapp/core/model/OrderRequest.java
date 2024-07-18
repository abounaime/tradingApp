package com.bounaime.tradingapp.core.model;

public class OrderRequest {
    private String epic;
    private String direction;
    private int size;
    private String orderType;
    private Double limitDistance;
    private Double stopDistance;

    public String getEpic() {
        return epic;
    }

    public void setEpic(String epic) {
        this.epic = epic;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Double getLimitDistance() {
        return limitDistance;
    }

    public void setLimitDistance(Double limitDistance) {
        this.limitDistance = limitDistance;
    }

    public Double getStopDistance() {
        return stopDistance;
    }

    public void setStopDistance(Double stopDistance) {
        this.stopDistance = stopDistance;
    }
}
