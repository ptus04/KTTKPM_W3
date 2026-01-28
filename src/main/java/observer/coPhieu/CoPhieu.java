package observer.coPhieu;

import java.util.ArrayList;
import java.util.List;

public class CoPhieu {
    private final List<Subscriber> subscribers;

    public CoPhieu() {
        this.subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyAllSubscribers(String status) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(status);
        }
    }
}
