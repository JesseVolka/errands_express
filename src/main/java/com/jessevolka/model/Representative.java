package com.jessevolka.model;

public class Representative {
    private String name;
    private String orderNumber;
    private String remarks;
    private int paymentType;

    @Override
    public String toString() {
        return "Representative{" +
                "name='" + name + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", remarks='" + remarks + '\'' +
                ", paymentType=" + paymentType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }
}
