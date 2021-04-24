package basepatterns.creational.abstractFactory.teamNight;

import basepatterns.creational.abstractFactory.Packers;

public class Packer implements Packers {
    @Override
    public void pack() {
        System.out.println("Packes goods into boxes.");
    }
}
