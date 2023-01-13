package com.jiateng.home.bean;

import java.io.File;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @Description:
 * @Title: ShopInfo
 * @ProjectName: orderFood
 * @date: 2023/1/11 0:23
 * @author: 骆家腾
 */
public class ShopInfo {
    private File shopImage;
    private String shopName;
    private String MonthlySales;
    private String space;
    private String time;

    public ShopInfo() {
    }

    public ShopInfo(File shopImage, String shopName, String monthlySales, String space, String time) {
        this.shopImage = shopImage;
        this.shopName = shopName;
        MonthlySales = monthlySales;
        this.space = space;
        this.time = time;
    }

    public File getShopImage() {
        return shopImage;
    }

    public void setShopImage(File shopImage) {
        this.shopImage = shopImage;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMonthlySales() {
        return MonthlySales;
    }

    public void setMonthlySales(String monthlySales) {
        MonthlySales = monthlySales;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ShopInfo{" +
                "shopImage=" + shopImage +
                ", shopName='" + shopName + '\'' +
                ", MonthlySales='" + MonthlySales + '\'' +
                ", space='" + space + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
