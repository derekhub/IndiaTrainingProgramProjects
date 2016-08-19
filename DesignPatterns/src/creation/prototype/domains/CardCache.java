package creation.prototype.domains;

public class CardCache {

    private CreditCard card;

    public void loadProduct(CreditCard card) {
        this.card = card;
    }

    public CreditCard getCachedCard() throws CloneNotSupportedException {
        return (CreditCard) card.clone();
    }

    public CreditCard getCard() {
        return card;
    }

}
