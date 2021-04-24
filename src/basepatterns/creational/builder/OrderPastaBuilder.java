package basepatterns.creational.builder;

public class OrderPastaBuilder extends OrderBuilder {
    @Override
    void buildName() {
        order.setNameOfGood("Паста очищающая, флакон 500 мл.");
    }

    @Override
    void buildQuantity() {
        order.setQuantity(2000);
    }

    @Override
    void buildMass() {
        order.setMass(Mass.PASTA);
    }

    @Override
    void buildTara() {
        order.setTara(Tara.BOTTLE);
    }
}
