package basepatterns.behavioral.strategy;

public class Operator {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void execute() {
        activity.justDoIt();
    }
}
