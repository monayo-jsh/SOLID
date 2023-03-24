package example;

public class ServiceFactoryImpl implements ServiceFactory {

    @Override
    public ConcreteImpl makeSvc() {
        return new ConcreteImpl();
    }
}
