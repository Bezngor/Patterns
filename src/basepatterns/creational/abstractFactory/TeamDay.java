package basepatterns.creational.abstractFactory;

import basepatterns.creational.abstractFactory.teamDay.TeamDayShiftFactory;

public class TeamDay {
    public static void main(String[] args) {
        TeamDayFactory teamDayFactory = new TeamDayShiftFactory();
        Loader loader = teamDayFactory.getLoader();
        Manager manager = teamDayFactory.getManager();
        Operator operator = teamDayFactory.getOperator();

        System.out.println("Creat team of Day shift...");
        manager.manage();
        operator.produce();
        loader.load();
    }
}
