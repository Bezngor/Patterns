package basepatterns.creational.builder;

public abstract class OrderBuilder {
    ProductionOrder order;

    void createOrder() {
        order = new ProductionOrder();
    }

    abstract void buildName();

    abstract void buildQuantity();

    abstract void buildMass();

    abstract void buildTara();

    ProductionOrder getOrder() {
        return order;
    }
}
