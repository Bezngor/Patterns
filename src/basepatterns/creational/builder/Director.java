package basepatterns.creational.builder;

public class Director {
    OrderBuilder builder;

    public void setBuilder(OrderBuilder builder) {
        this.builder = builder;
    }

    ProductionOrder buildOrder() {
        builder.createOrder();
        builder.buildName();
        builder.buildQuantity();
        builder.buildMass();
        builder.buildTara();

        return builder.getOrder();
    }
}
