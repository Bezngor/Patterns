package basepatterns.creational.factory;

public class ReactorOperatorFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new ReactorOperator();
    }
}
