package example;

public class ServiceFactoryImpl implements ServiceFactory {

    @Override
    public Service makeSvc() {
        return new ConcreteImpl();
    }
}
