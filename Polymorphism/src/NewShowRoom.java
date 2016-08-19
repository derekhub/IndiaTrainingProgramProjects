
public class NewShowRoom extends ShowRoom {

    public IAutomobile getProduct(int ch) {

        IAutomobile auto = null;

        if (ch == 4) {
            auto = new Bike();
        } else {
            auto = super.getProduct(ch);

        }
        return auto;
    }

}
