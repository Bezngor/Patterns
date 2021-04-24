package basepatterns.creational.abstractFactory.teamNight;

import basepatterns.creational.abstractFactory.Manager;
import basepatterns.creational.abstractFactory.Operator;
import basepatterns.creational.abstractFactory.Packers;
import basepatterns.creational.abstractFactory.TeamNightFactory;

public class TeamNightShiftFactory implements TeamNightFactory {
    @Override
    public Manager getManager() {
        return new TeamManager_Night();
    }

    @Override
    public Operator getOperator() {
        return new TubingOperator();
    }

    @Override
    public Packers getPacker() {
        return new basepatterns.creational.abstractFactory.teamNight.Packer();
    }
}
