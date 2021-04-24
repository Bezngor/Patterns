package basepatterns.creational.abstractFactory;

public interface TeamDayFactory {
    Manager getManager();
    Operator getOperator();
    Loader getLoader();
}
