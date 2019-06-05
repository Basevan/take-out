package com.tl.model;

public class Dish {
    private Integer dishId;

    private String dishName;

    private String belongMerId;

    private Integer salesVolume;

    private Double mark;

    private String dishLable;

    private String dishIntro;

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }

    public String getBelongMerId() {
        return belongMerId;
    }

    public void setBelongMerId(String belongMerId) {
        this.belongMerId = belongMerId == null ? null : belongMerId.trim();
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getDishLable() {
        return dishLable;
    }

    public void setDishLable(String dishLable) {
        this.dishLable = dishLable == null ? null : dishLable.trim();
    }

    public String getDishIntro() {
        return dishIntro;
    }

    public void setDishIntro(String dishIntro) {
        this.dishIntro = dishIntro == null ? null : dishIntro.trim();
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
        Dish other = (Dish) that;
        return (this.getDishId() == null ? other.getDishId() == null : this.getDishId().equals(other.getDishId()))
            && (this.getDishName() == null ? other.getDishName() == null : this.getDishName().equals(other.getDishName()))
            && (this.getBelongMerId() == null ? other.getBelongMerId() == null : this.getBelongMerId().equals(other.getBelongMerId()))
            && (this.getSalesVolume() == null ? other.getSalesVolume() == null : this.getSalesVolume().equals(other.getSalesVolume()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()))
            && (this.getDishLable() == null ? other.getDishLable() == null : this.getDishLable().equals(other.getDishLable()))
            && (this.getDishIntro() == null ? other.getDishIntro() == null : this.getDishIntro().equals(other.getDishIntro()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDishId() == null) ? 0 : getDishId().hashCode());
        result = prime * result + ((getDishName() == null) ? 0 : getDishName().hashCode());
        result = prime * result + ((getBelongMerId() == null) ? 0 : getBelongMerId().hashCode());
        result = prime * result + ((getSalesVolume() == null) ? 0 : getSalesVolume().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        result = prime * result + ((getDishLable() == null) ? 0 : getDishLable().hashCode());
        result = prime * result + ((getDishIntro() == null) ? 0 : getDishIntro().hashCode());
        return result;
    }
}