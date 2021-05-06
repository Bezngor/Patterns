package basepatterns.structural.adapter;

public class DepartmentProduction {
    public void getFromWarehouse() {
        System.out.println("Getting row materials from Warehouse for production...");
    }

    public void getForRecycling() {
        System.out.println("Getting goods for recycling...");
    }

    public void giveForReturn() {
        System.out.println("Giving row materials to Warehouse for return to Supplier...");
    }

    public void giveToWarehouse() {
        System.out.println("Giving goods to Warehouse for shipment to Buyers...");
    }
}
