package Pattern.factory;

public class ConcreteFactoryA2 implements Factory{

    public Product createProduct() {
        return new ConcreteProductA2();
    }
}
