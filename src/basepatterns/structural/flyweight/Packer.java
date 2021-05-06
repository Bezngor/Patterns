package basepatterns.structural.flyweight;

public class Packer implements Employee {
    @Override
    public void executeFunctional() {
        System.out.println("Packer packs goods into boxes...");
    }

    @Override
    public String toString() {
        return "Packer";
    }
}
