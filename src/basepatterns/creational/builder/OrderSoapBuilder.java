package basepatterns.creational.builder;

public class OrderSoapBuilder extends OrderBuilder {
    @Override
    void buildName() {
        order.setNameOfGood("Мыло жидкое, канистра 5 л.");
    }

    @Override
    void buildQuantity() {
        order.setQuantity(200);
    }

    @Override
    void buildMass() {
        order.setMass(Mass.SOAP);
    }

    @Override
    void buildTara() {
        order.setTara(Tara.CANISTER);
    }
}
