package basepatterns.behavioral.strategy;

public class PlanRunner {
    public static void main(String[] args) {
        Operator operator = new Operator();

        operator.setActivity(new GettingPlan());
        operator.execute();

        operator.setActivity(new ProcessingPlan(5));
        operator.execute();

        operator.setActivity(new FinishingPlan());
        operator.execute();
    }
}
