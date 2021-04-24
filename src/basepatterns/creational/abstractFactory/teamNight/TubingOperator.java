package basepatterns.creational.abstractFactory.teamNight;

import basepatterns.creational.abstractFactory.Operator;

public class TubingOperator implements Operator {
    @Override
    public void produce() {
        System.out.println("Produces tubes.");
    }
}
