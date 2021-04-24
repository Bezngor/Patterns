package basepatterns.creational.builder;

public class ProductionOrder {
    private String nameOfGood;
    private int quantity;
    private Mass mass;
    private Tara tara;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMass(Mass mass) {
        this.mass = mass;
    }

    public void setTara(Tara tara) {
        this.tara = tara;
    }

    public void setNameOfGood(String nameOfGood) {
        this.nameOfGood = nameOfGood;
    }

    @Override
    public String toString() {
        return "ProductionOrder{" +
                "nameOfGood='" + nameOfGood + '\'' +
                ", quantity=" + quantity +
                ", mass=" + mass +
                ", tara=" + tara +
                '}';
    }
}
