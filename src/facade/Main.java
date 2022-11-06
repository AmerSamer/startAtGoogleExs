package facade;

import facade.classes.HttpFacade;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        HttpFacade httpFacade = new HttpFacade();
        httpFacade.call("GET");
        httpFacade.call("POST");
        httpFacade.call("PUT");
        httpFacade.call("PATCH");
    }
}
