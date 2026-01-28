package observer.task;

public class ThanhVien implements TaskSubscriber {
    private final String thanhVienId;

    public ThanhVien(String thanhVienId) {
        this.thanhVienId = thanhVienId;
    }

    @Override
    public void update(String taskId, TaskStatus status) {
        System.out.println("[Thành viên " + thanhVienId + "] --> Task " + taskId + ": " + status);
    }
}
