package basepatterns.structural.bridge;

import basepatterns.creational.builder.Mass;

public abstract class Equipment {
    protected Operator operator;
    protected Mass mass;
    protected int quantity;

    public Equipment(Operator operator, Mass mass, int quantity) {
        this.operator = operator;
        this.mass = mass;
        this.quantity = quantity;
    }

    protected void showEquipmentInfo() {
        System.out.println(this.getClass().getSimpleName() + " produces: " + mass + "; quantity: " + quantity);
    }

    protected abstract void operatorProduces();
}
