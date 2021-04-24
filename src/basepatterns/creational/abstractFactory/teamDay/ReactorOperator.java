package basepatterns.creational.abstractFactory.teamDay;

import basepatterns.creational.abstractFactory.Operator;

public class ReactorOperator implements Operator {
    @Override
    public void produce() {
        System.out.println("Produces mass.");
    }
}
