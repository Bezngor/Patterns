package basepatterns.creational.abstractFactory;

public interface TeamNightFactory {
    Manager getManager();
    Operator getOperator();
    Packers getPacker();
}
