package basepatterns.creational.prototype;

public class BuyerOrderFactory {
    BuyerOrder order;

    public BuyerOrderFactory(BuyerOrder order) {
        this.order = order;
    }

    public void setOrder(BuyerOrder order) {
        this.order = order;
    }

    BuyerOrder orderClone() {
        return (BuyerOrder) order.copy();
    }
}
