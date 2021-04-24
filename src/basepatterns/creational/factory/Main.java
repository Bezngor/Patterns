package basepatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = createEmployeeByOutputProducts("box");
        Employee employee = employeeFactory.createEmployee();

        employee.functional();
    }

    static EmployeeFactory createEmployeeByOutputProducts(String outputProd) {
        if (outputProd.equalsIgnoreCase("mass")) {
            return new ReactorOperatorFactory();
        } else if (outputProd.equalsIgnoreCase("tube")) {
            return new TubingOperatorFactory();
        } else if (outputProd.equalsIgnoreCase("box")) {
            return new PackerFactory();
        } else throw new RuntimeException(outputProd + " is unknown output products!");
    }
}
