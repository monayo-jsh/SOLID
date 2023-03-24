package example;

public class ConcreteImpl implements Service {

    @Override
    public void method1() {
        System.out.println("example.Service.method1() 구현");
    }

    @Override
    public void method2() {
        System.out.println("example.Service.method2() 구현");
    }
}
