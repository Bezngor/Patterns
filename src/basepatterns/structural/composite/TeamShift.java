package basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamShift {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void createShift() {
        System.out.println("Shift created:\n");
        for (Employee employee : employees) {
            employee.makeFunctional();
        }
    }
}
