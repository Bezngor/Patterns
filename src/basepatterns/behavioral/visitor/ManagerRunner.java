package basepatterns.behavioral.visitor;

public class ManagerRunner {
    public static void main(String[] args) {
        Production production = new Production();

        ManagerTeam managerDayTeam = new ManagerDayTeam();
        ManagerTeam managerNightTeam = new ManagerNightTeam();

        System.out.println("Day team in Action...");
        production.executeStage(managerDayTeam);

        System.out.println("\n========================\n");

        System.out.println("Night team in Action...");
        production.executeStage(managerNightTeam);
    }
}
