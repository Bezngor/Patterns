package basepatterns.creational.abstractFactory.teamDay;

import basepatterns.creational.abstractFactory.Manager;

public class TeamManager_Day implements Manager {
    @Override
    public void manage() {
        System.out.println("Manages team of Day shift.");
    }
}
