
public class FirstExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = null;

        try {
            System.out.println("String Length" + s.length());

        } catch (NullPointerException e) {
            // TODO: handle exception
            System.err.println("String value is null - check it");
            System.err.println(e.getMessage());
        } finally {

            System.out.println("inside finally");
        }

        System.out.println("bye...");

    }

}
