package N20DCVT038_OOP_TH3_03;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã số sinh viên:");
        String maSV = scanner.nextLine();

        System.out.println("Nhập họ tên sinh viên:");
        String hoTen = scanner.nextLine();

        System.out.println("Nhập ngày sinh (ngày/tháng/năm):");
        String ngaySinhStr = scanner.nextLine();
        String[] ngaySinhArr = ngaySinhStr.split("/");
        int ngay = Integer.parseInt(ngaySinhArr[0]);
        int thang = Integer.parseInt(ngaySinhArr[1]);
        int nam = Integer.parseInt(ngaySinhArr[2]);
        NgaySinh ngaySinh = new NgaySinh(ngay, thang, nam);

        System.out.println("Nhập điểm trung bình:");
        double diemTrungBinh = scanner.nextDouble();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        System.out.println("Nhập tên lớp:");
        String tenLop = scanner.nextLine();

        System.out.println("Nhập tên khoa:");
        String tenKhoa = scanner.nextLine();
        Lop lop = new Lop(tenLop, tenKhoa);

        SinhVien sinhVien = new SinhVien(maSV, hoTen, ngaySinh, diemTrungBinh, lop);

        // Test methods
        System.out.println("Tên khoa của sinh viên: " + sinhVien.layTenKhoa());
        System.out.println("Sinh viên có đủ điều kiện tốt nghiệp: " + sinhVien.kiemTraDuDieuKienTotNghiep());

        scanner.close();
    }
}
