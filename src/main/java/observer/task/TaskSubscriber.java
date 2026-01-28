package observer.task;

public interface TaskSubscriber {
    void update(String taskId, TaskStatus status);
}
