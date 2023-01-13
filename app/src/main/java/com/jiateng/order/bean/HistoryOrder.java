package com.jiateng.order.bean;

import java.util.Date;

/**
 * @Description:
 * @Title: HistoryOrder
 * @ProjectName: orderFood
 * @date: 2023/1/11 12:56
 * @author: 骆家腾
 */
public class HistoryOrder {
    private String shopName;
    private Double paid;
    //TODO 之后将状态改为枚举类
    private String status;
    //TODO 时间类改写
    private String time;

    public HistoryOrder() {
    }

    public HistoryOrder(String shopName, Double paid, String status, String time) {
        this.shopName = shopName;
        this.paid = paid;
        this.status = status;
        this.time = time;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "HistoryOrder{" +
                "shopName='" + shopName + '\'' +
                ", paid=" + paid +
                ", status='" + status + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
