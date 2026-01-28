package observer.task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Task {
    private final List<TaskSubscriber> taskSubscribers;
    private final String taskId;

    public Task() {
        this.taskSubscribers = new ArrayList<>();
        this.taskId = UUID.randomUUID().toString();
    }

    public void addSubscriber(TaskSubscriber taskSubscriber) {
        taskSubscribers.add(taskSubscriber);
    }

    public void removeSubscriber(TaskSubscriber taskSubscriber) {
        taskSubscribers.remove(taskSubscriber);
    }

    public void notifyAllSubscribers(TaskStatus status) {
        for (TaskSubscriber taskSubscriber : taskSubscribers) {
            taskSubscriber.update(taskId, status);
        }
    }
}
