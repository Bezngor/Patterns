package basepatterns.behavioral.command;

public class Storekeeper {
    Command getR;
    Command getG;
    Command giveR;
    Command giveG;

    public Storekeeper(Command getR, Command getG, Command giveR, Command giveG) {
        this.getR = getR;
        this.getG = getG;
        this.giveR = giveR;
        this.giveG = giveG;
    }

    public void getRowMaterials() {
        getR.execute();
    }

    public void getGoods() {
        getG.execute();
    }

    public void giveRawMaterials() {
        giveR.execute();
    }

    public void giveGoods() {
        giveG.execute();
    }
}
