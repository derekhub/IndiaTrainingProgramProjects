package creation.singleton.domains;

public class RequestHandler {

    private static RequestHandler handler;

    private RequestHandler() {

    }

    public static RequestHandler getInstance() {
        if (handler == null) {
            synchronized (handler) {

                handler = new RequestHandler();
            }
        }
        return handler;
    }

}
