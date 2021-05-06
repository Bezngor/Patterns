package basepatterns.structural.bridge;

import basepatterns.creational.builder.Mass;

public class Reactor1 extends Equipment {

    public Reactor1(Operator operator, Mass mass, int quantity) {
        super(operator, mass, quantity);
    }

    @Override
    protected void operatorProduces() {
        showEquipmentInfo();
        operator.produce();
    }
}
