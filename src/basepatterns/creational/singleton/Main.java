package basepatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        OrderLogistic.getOrderLogistic().addLoadingPoint("Moscow, Slavyanskaya street, 34-5");
        OrderLogistic.getOrderLogistic().addLoadingPoint("Podolsk, Mira street, 88");
        OrderLogistic.getOrderLogistic().addLoadingPoint("Kursk, Novaya street, 1B");
        OrderLogistic.getOrderLogistic().addLoadingPoint("Belgorod, Koneva street, 29");

        OrderLogistic.getOrderLogistic().showLoadingPoints();
    }
}
