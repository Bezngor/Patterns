package basepatterns.creational.abstractFactory;

import basepatterns.creational.abstractFactory.teamNight.TeamNightShiftFactory;

public class TeamNight {
    public static void main(String[] args) {
        TeamNightFactory teamNightFactory = new TeamNightShiftFactory();
        Manager manager = teamNightFactory.getManager();
        Operator operator = teamNightFactory.getOperator();
        Packers packer = teamNightFactory.getPacker();

        System.out.println("Creat team of Night shift...");
        manager.manage();
        operator.produce();
        packer.pack();
    }
}
