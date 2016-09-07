package com.training.domains;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.stereotype.Component;

@Component
public class Food {

    @NotNull
    private long foodCode;

    @NotEmpty(message = "description must not be empty")
    private String description;
    private double unitPrice;

    private String cuisine;

    public Food() {
        super();
    }

    @Min(value = 1)
    @Max(value = 100)
    @NumberFormat(style = Style.NUMBER)
    @Pattern(regexp = "{0-9}{3}")
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
