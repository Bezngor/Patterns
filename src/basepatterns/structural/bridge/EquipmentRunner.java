package basepatterns.structural.bridge;


import basepatterns.creational.builder.Mass;

public class EquipmentRunner {
    public static void main(String[] args) {
        Equipment[] equipment = {
                new Reactor1(new OperatorOfReactor("Ivanov"), Mass.CREAM, 1800),
                new Reactor2(new OperatorOfReactor("Petrov"), Mass.SOAP, 1000),
                new TubingMachine(new OperatorOfTubingMachine("Sidorov"), Mass.PASTA, 15000)};

        for (Equipment eq : equipment) {
            eq.operatorProduces();

        }
    }
}
