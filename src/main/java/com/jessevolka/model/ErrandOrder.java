package com.jessevolka.model;

import java.math.BigDecimal;
import java.util.Date;

public class ErrandOrder {
    private String orderNumber;
    private Date orderTime;
    private Date submissionTime;
    private String pickUpCode;
    private BigDecimal price;
    private String remarks;

    @Override
    public String toString() {
        return "ErrandOrder{" +
                "orderNumber='" + orderNumber + '\'' +
                ", orderTime=" + orderTime +
                ", submissionTime=" + submissionTime +
                ", pickUpCode='" + pickUpCode + '\'' +
                ", price=" + price +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String getPickUpCode() {
        return pickUpCode;
    }

    public void setPickUpCode(String pickUpCode) {
        this.pickUpCode = pickUpCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
