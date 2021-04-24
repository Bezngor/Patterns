package basepatterns.creational.builder;

public class BuildOrderRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new OrderCreamBuilder());
        ProductionOrder order = director.buildOrder();

        System.out.println(order);
    }
}
