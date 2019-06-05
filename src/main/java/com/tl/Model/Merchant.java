package com.tl.model;

import java.math.BigDecimal;

public class Merchant {
    private Integer merchantId;

    private String merchantName;

    private String address;

    private String merchantIntro;

    private String merchantLable;

    private BigDecimal minDeliveryPrice;

    private BigDecimal deleveryPrice;

    private Integer avgArriveTime;

    private Integer newMerchant;

    private Integer insurance;

    private Integer compensate;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMerchantIntro() {
        return merchantIntro;
    }

    public void setMerchantIntro(String merchantIntro) {
        this.merchantIntro = merchantIntro == null ? null : merchantIntro.trim();
    }

    public String getMerchantLable() {
        return merchantLable;
    }

    public void setMerchantLable(String merchantLable) {
        this.merchantLable = merchantLable == null ? null : merchantLable.trim();
    }

    public BigDecimal getMinDeliveryPrice() {
        return minDeliveryPrice;
    }

    public void setMinDeliveryPrice(BigDecimal minDeliveryPrice) {
        this.minDeliveryPrice = minDeliveryPrice;
    }

    public BigDecimal getDeleveryPrice() {
        return deleveryPrice;
    }

    public void setDeleveryPrice(BigDecimal deleveryPrice) {
        this.deleveryPrice = deleveryPrice;
    }

    public Integer getAvgArriveTime() {
        return avgArriveTime;
    }

    public void setAvgArriveTime(Integer avgArriveTime) {
        this.avgArriveTime = avgArriveTime;
    }

    public Integer getNewMerchant() {
        return newMerchant;
    }

    public void setNewMerchant(Integer newMerchant) {
        this.newMerchant = newMerchant;
    }

    public Integer getInsurance() {
        return insurance;
    }

    public void setInsurance(Integer insurance) {
        this.insurance = insurance;
    }

    public Integer getCompensate() {
        return compensate;
    }

    public void setCompensate(Integer compensate) {
        this.compensate = compensate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Merchant other = (Merchant) that;
        return (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getMerchantIntro() == null ? other.getMerchantIntro() == null : this.getMerchantIntro().equals(other.getMerchantIntro()))
            && (this.getMerchantLable() == null ? other.getMerchantLable() == null : this.getMerchantLable().equals(other.getMerchantLable()))
            && (this.getMinDeliveryPrice() == null ? other.getMinDeliveryPrice() == null : this.getMinDeliveryPrice().equals(other.getMinDeliveryPrice()))
            && (this.getDeleveryPrice() == null ? other.getDeleveryPrice() == null : this.getDeleveryPrice().equals(other.getDeleveryPrice()))
            && (this.getAvgArriveTime() == null ? other.getAvgArriveTime() == null : this.getAvgArriveTime().equals(other.getAvgArriveTime()))
            && (this.getNewMerchant() == null ? other.getNewMerchant() == null : this.getNewMerchant().equals(other.getNewMerchant()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getCompensate() == null ? other.getCompensate() == null : this.getCompensate().equals(other.getCompensate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getMerchantIntro() == null) ? 0 : getMerchantIntro().hashCode());
        result = prime * result + ((getMerchantLable() == null) ? 0 : getMerchantLable().hashCode());
        result = prime * result + ((getMinDeliveryPrice() == null) ? 0 : getMinDeliveryPrice().hashCode());
        result = prime * result + ((getDeleveryPrice() == null) ? 0 : getDeleveryPrice().hashCode());
        result = prime * result + ((getAvgArriveTime() == null) ? 0 : getAvgArriveTime().hashCode());
        result = prime * result + ((getNewMerchant() == null) ? 0 : getNewMerchant().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getCompensate() == null) ? 0 : getCompensate().hashCode());
        return result;
    }
}