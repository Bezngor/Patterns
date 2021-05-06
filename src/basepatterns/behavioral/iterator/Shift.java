package basepatterns.behavioral.iterator;

import basepatterns.structural.flyweight.Employee;

import java.util.List;

public class Shift implements Collection {
    String name;
    List<Employee> employees;

    public Shift(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < employees.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return employees.get(index++);
        }
    }
}
