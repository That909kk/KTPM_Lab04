package observer;

public class Main {
    public static void main(String[] args) {

        LopHoc lopJava = new LopHoc("Lập trình Java");

        SinhVien sv1 = new SinhVien("Nguyễn Văn A", "SV001");
        SinhVien sv2 = new SinhVien("Trần Thị B", "SV002");
        SinhVien sv3 = new SinhVien("Lê Văn C", "SV003");
        
        lopJava.attach(sv1);
        lopJava.attach(sv2);
        lopJava.attach(sv3);
        
     
        System.out.println("=== Thông báo lần 1 ===");
        lopJava.notify("Tuần sau kiểm tra giữa kỳ.");
       
        System.out.println("\n=== Sau khi sinh viên C nghỉ học ===");
        lopJava.detach(sv3);
        
        System.out.println("\n=== Thông báo lần 2 ===");
        lopJava.notify("Nộp bài tập về nhà vào thứ 6.");
    }
}