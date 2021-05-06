package basepatterns.behavioral.template;

public class ProductionRunner {
    public static void main(String[] args) {
        StagesOfProduction mass = new Mass();
        StagesOfProduction tube = new Tube();
        StagesOfProduction soap = new Soap();

        mass.stages();
        System.out.println("\n=========================\n");
        tube.stages();
        System.out.println("\n=========================\n");
        soap.stages();
    }
}
