package basepatterns.structural.composite;



public class Shift {
    public static void main(String[] args) {
        TeamShift dayShift = new TeamShift();

        Employee operator1 = new OperatorOfReactor();
        Employee operator2 = new OperatorOfReactor();
        Employee operator3 = new OperatorOfReactor();
        Employee operator4 = new OperatorOfTubingMachine();
        Employee operator5 = new OperatorOfTubingMachine();
        Employee loader = new Loader();

        dayShift.addEmployee(operator1);
        dayShift.addEmployee(operator2);
        dayShift.addEmployee(operator3);
        dayShift.addEmployee(operator4);
        dayShift.addEmployee(operator5);
        dayShift.addEmployee(loader);

        dayShift.createShift();
    }
}
