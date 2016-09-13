package org.service.entitiy;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    private int cartId;
    private String item;

    public ShoppingCart() {
        super();
    }

    public ShoppingCart(int cartId, String item) {
        super();
        this.cartId = cartId;
        this.item = item;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "ShoppingCart [cartId=" + cartId + ", item=" + item + "]";
    }

}
