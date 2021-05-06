package basepatterns.behavioral.state;

public class ProcessingPlan implements Activity {
    public int quantityCycles = GettingPlan.quantityCycles;

    @Override
    public void justDoIt() {
        for (int i = 0; i < quantityCycles; i++) {
            System.out.println("Making mass...");
        }
    }
}
