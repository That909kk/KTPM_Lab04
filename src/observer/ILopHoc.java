package observer;

public interface ILopHoc {
	 void attach(ISinhVien observer);
	 void detach(ISinhVien observer);
	 void notify(String thongBao);
}
