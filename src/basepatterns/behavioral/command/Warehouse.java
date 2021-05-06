package basepatterns.behavioral.command;

public class Warehouse {
    public void getRawMaterials() {
        System.out.println("Getting row materials...");
    }

    public void getGoods() {
        System.out.println("Getting goods...");
    }

    public void giveRawMaterials() {
        System.out.println("Giving row materials...");
    }

    public void giveGoods() {
        System.out.println("Giving goods...");
    }
}
