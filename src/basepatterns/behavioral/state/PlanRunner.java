package basepatterns.behavioral.state;

public class PlanRunner {
    public static void main(String[] args) {
        Activity activity = new GettingPlan(3);
        OperatorReactor operator = new OperatorReactor();
        operator.setActivity(activity);

        for (int i = 0; i < 3; i++) {
            operator.justDoIt();
            operator.changeActivity();
        }
    }
}
