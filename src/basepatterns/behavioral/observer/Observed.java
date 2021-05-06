package basepatterns.behavioral.observer;

import java.util.List;

public interface Observed {
    void addObserver(Observer manager);

    void removeObserver(Observer manager);

    void notifyObservers(List<String> orders);
}
