package basepatterns.behavioral.template;

public abstract class StagesOfProduction {
    public void stages() {
        System.out.println("Getting a plan of production...");
        productionStage();
        System.out.println("Making a report...");
        System.out.println("Finishing production...");
    }

    public abstract void productionStage();
}
