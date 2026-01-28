package observer.coPhieu;

public class NhaDauTu implements Subscriber {
    private final String maNhaDauTu;

    public NhaDauTu(String maNhaDauTu) {
        this.maNhaDauTu = maNhaDauTu;
    }

    @Override
    public void update(String status) {
        System.out.println("[Nhà đầu tư " + maNhaDauTu + "] --> Cổ phiếu " + status);
    }
}
