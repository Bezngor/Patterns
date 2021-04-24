package basepatterns.creational.builder;

public class OrderCreamBuilder extends OrderBuilder {
    @Override
    void buildName() {
        order.setNameOfGood("Крем регенерирующий, туба 100мл.");
    }

    @Override
    void buildQuantity() {
        order.setQuantity(7000);
    }

    @Override
    void buildMass() {
        order.setMass(Mass.CREAM);
    }

    @Override
    void buildTara() {
        order.setTara(Tara.TUBE);
    }
}
