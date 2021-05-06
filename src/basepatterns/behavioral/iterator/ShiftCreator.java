package basepatterns.behavioral.iterator;

import basepatterns.structural.flyweight.Employee;
import basepatterns.structural.flyweight.EmplpyeeFactory;

import java.util.ArrayList;
import java.util.List;

public class ShiftCreator {
    public static void main(String[] args) {
        EmplpyeeFactory factory = new EmplpyeeFactory();
        List<Employee> employees = new ArrayList<>();

        employees.add(factory.getEmployeesBySpeciality("reactor"));
        employees.add(factory.getEmployeesBySpeciality("tube"));
        employees.add(factory.getEmployeesBySpeciality("packer"));
        employees.add(factory.getEmployeesBySpeciality("loader"));

        System.out.println("==================");

        Shift shift = new Shift("Day team", employees);
        Iterator iterator = shift.getIterator();

        System.out.println("Shift: " + shift.name);
        System.out.println("Employees:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
