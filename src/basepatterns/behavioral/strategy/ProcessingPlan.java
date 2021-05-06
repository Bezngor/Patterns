package basepatterns.behavioral.strategy;

public class ProcessingPlan implements Activity {
    private int quantityCycles;

    public ProcessingPlan(int quantityCycles) {
        this.quantityCycles = quantityCycles;
    }

    @Override
    public void justDoIt() {
        for (int i = 0; i < quantityCycles; i++) {
            System.out.println("Making mass...");
        }
    }
}
