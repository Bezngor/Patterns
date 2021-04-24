package basepatterns.creational.factory;

public class PackerFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Packer();
    }
}
