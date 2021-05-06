package basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmplpyeeFactory {
    private static final Map<String, Employee> employees = new HashMap<>();

    public Employee getEmployeesBySpeciality(String speciality) {
        Employee employee = employees.get(speciality);

        if (employee == null) {
            switch (speciality) {
                case "reactor":
                    System.out.println("Hiring operator of Reactor...");
                    employee = new OperatorReactor();
                    break;
                case "tube":
                    System.out.println("Hiring operator of Tubing machine...");
                    employee = new OperatorTubingMachine();
                    break;
                case "packer":
                    System.out.println("Hiring packer...");
                    employee = new Packer();
                    break;
                case "loader":
                    System.out.println("Hiring loader...");
                    employee = new Loader();
            }
            employees.put(speciality, employee);
        }
        return employee;
    }
}
