package basepatterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> orders);
}
