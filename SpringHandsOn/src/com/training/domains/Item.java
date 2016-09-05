package com.training.domains;

public class Item {

    private String itemName;
    private int itemNumber;
    private int rate;

    public Item() {
        super();
    }

    public Item(String itemName, int itemNumber, int rate) {
        super();
        this.itemName = itemName;
        this.itemNumber = itemNumber;
        this.rate = rate;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Item [itemName=" + itemName + ", itemNumber=" + itemNumber + ", rate=" + rate + "]";
    }

}
