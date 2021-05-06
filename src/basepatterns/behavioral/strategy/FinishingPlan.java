package basepatterns.behavioral.strategy;

public class FinishingPlan implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Plan is finished!");
    }
}
