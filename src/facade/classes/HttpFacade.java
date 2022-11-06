package facade.classes;

public class HttpFacade {
    private ApacheHttp apacheHttp;

    public HttpFacade() {
        this.apacheHttp = new ApacheHttp();
    }

    public void call(String type) throws IllegalAccessException {
        switch (type) {
            case "GET":
                System.out.println(apacheHttp.getRequest());
                break;
            case "POST":
                System.out.println(apacheHttp.postRequest());
                break;
            case "PUT":
                System.out.println(apacheHttp.putRequest());
                break;
            case "PATCH":
                System.out.println(apacheHttp.patchRequest());
                break;
            default:
                throw new IllegalAccessException("wrong type string");
        }
    }

}

