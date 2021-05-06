package basepatterns.behavioral.state;

public class GettingPlan implements Activity {
    static int quantityCycles;

    public GettingPlan(int quantityCycles) {
        GettingPlan.quantityCycles = quantityCycles;
    }

    @Override
    public void justDoIt() {
        System.out.println("Getting plan. Quantity cycles: " + quantityCycles);
    }
}
