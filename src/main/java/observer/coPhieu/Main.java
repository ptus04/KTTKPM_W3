package observer.coPhieu;

public class Main {
    public static void main(String[] args) {
        CoPhieu coPhieu = new CoPhieu();
        Subscriber nhaDauTu1 = new NhaDauTu("NĐT001");
        Subscriber nhaDauTu2 = new NhaDauTu("NĐT002");
        Subscriber nhaDauTu3 = new NhaDauTu("NĐT003");

        coPhieu.addSubscriber(nhaDauTu1);
        coPhieu.addSubscriber(nhaDauTu2);
        coPhieu.addSubscriber(nhaDauTu3);

        coPhieu.notifyAllSubscribers("Tăng");
        coPhieu.notifyAllSubscribers("Giảm");
    }
}
