package basepatterns.creational.factory;

public class TubingOperatorFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new TubingOperator();
    }
}
