package basepatterns.creational.abstractFactory.teamDay;

import basepatterns.creational.abstractFactory.Loader;
import basepatterns.creational.abstractFactory.Manager;
import basepatterns.creational.abstractFactory.Operator;
import basepatterns.creational.abstractFactory.TeamDayFactory;

public class TeamDayShiftFactory implements TeamDayFactory {
    @Override
    public Manager getManager() {
        return new TeamManager_Day();
    }

    @Override
    public Operator getOperator() {
        return new ReactorOperator();
    }

    @Override
    public Loader getLoader() {
        return new LoaderIntoTrack();
    }
}
