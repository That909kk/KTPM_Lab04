package observer;

public class SinhVien implements ISinhVien {
    private String hoTen;
    private String mssv;

    public SinhVien(String hoTen, String mssv) {
        this.hoTen = hoTen;
        this.mssv = mssv;
    }

    @Override
    public void update(String thongBao) {
        System.out.printf("Sinh viên %s (MSSV: %s) nhận thông báo: %s%n", 
            hoTen, mssv, thongBao);
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMssv() {
        return mssv;
    }
}