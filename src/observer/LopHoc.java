package observer;

import java.util.ArrayList;
import java.util.List;

public class LopHoc implements ILopHoc {
    private String tenLop;
    private List<ISinhVien> danhSachSV;

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.danhSachSV = new ArrayList<>();
    }

    @Override
    public void attach(ISinhVien observer) {
        danhSachSV.add(observer);
    }

    @Override
    public void detach(ISinhVien observer) {
        danhSachSV.remove(observer);
    }

    @Override
    public void notify(String thongBao) {
        for (ISinhVien sv : danhSachSV) {
            sv.update(String.format("%s %s", tenLop, thongBao));
        }
    }

    public String getTenLop() {
        return tenLop;
    }
}