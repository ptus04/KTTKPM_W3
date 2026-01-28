package observer.task;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        TaskSubscriber thanhVien1 = new ThanhVien("001");
        TaskSubscriber thanhVien2 = new ThanhVien("002");
        TaskSubscriber thanhVien3 = new ThanhVien("003");

        task.addSubscriber(thanhVien1);
        task.addSubscriber(thanhVien2);
        task.addSubscriber(thanhVien3);
        task.notifyAllSubscribers(TaskStatus.IN_PROGRESS);
        task.removeSubscriber(thanhVien2);
        task.notifyAllSubscribers(TaskStatus.COMPLETED);
    }
}
