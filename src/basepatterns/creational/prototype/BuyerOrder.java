package basepatterns.creational.prototype;

public class BuyerOrder implements Copyable {
    int id;
    String buyerName;
    String buyerAddress;
    String itemsList;

    public BuyerOrder(int id, String buyerName, String buyerAddress, String itemsList) {
        this.id = id;
        this.buyerName = buyerName;
        this.buyerAddress = buyerAddress;
        this.itemsList = itemsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getItemsList() {
        return itemsList;
    }

    public void setItemsList(String itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public Object copy() {
        return new BuyerOrder(id,buyerName,buyerAddress,itemsList);
    }

    @Override
    public String toString() {
        return "BuyerOrder{" +
                "id=" + id +
                ", buyerName='" + buyerName + '\'' +
                ", buyerAddress='" + buyerAddress + '\'' +
                ", itemsList='" + itemsList + '\'' +
                '}';
    }
}
