package creation.prototype.domains;

public class CreditCard implements Cloneable{
    
    private long cardNUmber;
    private String cardHolderName;
    private String creditRating;
    private double creditLimit;
    
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
