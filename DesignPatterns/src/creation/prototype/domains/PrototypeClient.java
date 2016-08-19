package creation.prototype.domains;

public class PrototypeClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO Auto-generated method stub

        CreditCard card = new CreditCard();

        CardCache cache = new CardCache();

        System.out.println("Original Card Hash Code: = " + card.hashCode());

        cache.loadProduct(card);
        CreditCard cacheCard = cache.getCachedCard();

        System.out.println("Cached Card Hash Code := " + cacheCard.hashCode());

    }

}
