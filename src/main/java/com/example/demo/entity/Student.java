package com.example.demo.entity;

import java.util.Date;

/**
 * @author zhengyangtao
 * @create 2018-09-03 17:22
 */
public class Student {
    private Integer couponId;
    private String couponName;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "couponId=" + couponId +
                ", couponName='" + couponName + '\'' +
                '}';
    }
}
