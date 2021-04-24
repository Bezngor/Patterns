package basepatterns.creational.abstractFactory.teamDay;

import basepatterns.creational.abstractFactory.Loader;

public class LoaderIntoTrack implements Loader {
    @Override
    public void load() {
        System.out.println("Loads boxes into track.");
    }
}
