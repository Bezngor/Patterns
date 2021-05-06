package basepatterns.creational.prototype;

public class CopierRunner {
    public static void main(String[] args) {
        BuyerOrder order = new BuyerOrder(1, "Ruskhimset", "Moscow",
                "Betain:200,Laurethsulfat:3000,Benzophenon:150");
        System.out.println(order);

        System.out.println("\n===========================\n");

        BuyerOrderFactory factory = new BuyerOrderFactory(order);
        BuyerOrder orderClone = factory.orderClone();
        System.out.println(orderClone);
    }
}
