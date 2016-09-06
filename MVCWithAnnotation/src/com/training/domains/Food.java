package com.training.domains;

import org.springframework.stereotype.Component;

@Component
public class Food {

    private long foodCode;
    private String description;
    private double unitPrice;

    private String cuisine;

    public Food() {
        super();
    }

    public long getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(long foodCode) {
        this.foodCode = foodCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    public String toString() {
        return "Food [foodCode=" + foodCode + ", description=" + description + ", unitPrice=" + unitPrice + ", cuisine="
                + cuisine + "]";
    }

}
