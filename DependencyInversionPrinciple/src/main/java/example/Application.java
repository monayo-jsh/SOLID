package example;

public class Application {

    private final ServiceFactory serviceFactory;

    public Application(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    public void run() {
        Service service = serviceFactory.makeSvc();

        service.method1();
        service.method2();
    }

}
