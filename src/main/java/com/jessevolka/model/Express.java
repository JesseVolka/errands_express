package com.jessevolka.model;

public class Express {
    private String pickUpCode;
    private String expressContent;
    private String expressNumber;
    private String remarks;

    @Override
    public String toString() {
        return "Express{" +
                "pickUpCode='" + pickUpCode + '\'' +
                ", expressContent='" + expressContent + '\'' +
                ", expressNumber='" + expressNumber + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public String getPickUpCode() {
        return pickUpCode;
    }

    public void setPickUpCode(String pickUpCode) {
        this.pickUpCode = pickUpCode;
    }

    public String getExpressContent() {
        return expressContent;
    }

    public void setExpressContent(String expressContent) {
        this.expressContent = expressContent;
    }

    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
