package basepatterns.structural.bridge;

import basepatterns.creational.builder.Mass;

public class TubingMachine extends Equipment {

    public TubingMachine(Operator operator, Mass mass, int quantity) {
        super(operator, mass, quantity);
    }

    @Override
    protected void operatorProduces() {
        showEquipmentInfo();
        operator.produce();
    }
}
