package basepatterns.behavioral.state;

public class OperatorReactor {
    Activity activity;

    public void setActivity (Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof GettingPlan) {
            setActivity(new ProcessingPlan());
        }else if (activity instanceof ProcessingPlan) {
            setActivity(new FinishingPlan());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
