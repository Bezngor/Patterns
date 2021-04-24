package basepatterns.creational.abstractFactory.teamNight;

import basepatterns.creational.abstractFactory.Manager;

public class TeamManager_Night implements Manager {
    @Override
    public void manage() {
        System.out.println("Manages team of night shift.");
    }
}
