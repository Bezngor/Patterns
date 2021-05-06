package basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ShiftCreator {
    public static void main(String[] args) {
        EmplpyeeFactory emplpyeeFactory = new EmplpyeeFactory();
        List<Employee> employees = new ArrayList<>();

        employees.add(emplpyeeFactory.getEmployeesBySpeciality("reactor"));
        employees.add(emplpyeeFactory.getEmployeesBySpeciality("reactor"));
        employees.add(emplpyeeFactory.getEmployeesBySpeciality("tube"));
        employees.add(emplpyeeFactory.getEmployeesBySpeciality("tube"));
        employees.add(emplpyeeFactory.getEmployeesBySpeciality("packer"));
        employees.add(emplpyeeFactory.getEmployeesBySpeciality("packer"));
        employees.add(emplpyeeFactory.getEmployeesBySpeciality("packer"));
        employees.add(emplpyeeFactory.getEmployeesBySpeciality("packer"));
        employees.add(emplpyeeFactory.getEmployeesBySpeciality("loader"));
        employees.add(emplpyeeFactory.getEmployeesBySpeciality("loader"));

        for (Employee employee : employees) {
            employee.executeFunctional();
        }
    }
}
