package N20DCVT038_OOP_TH3_03;

public class SinhVien {
	 private String maSV;
	    private String hoTen;
	    private NgaySinh ngaySinh;
	    private double diemTrungBinh;
	    private Lop lop;

	    public SinhVien(String maSV, String hoTen, NgaySinh ngaySinh, double diemTrungBinh, Lop lop) {
	        this.maSV = maSV;
	        this.hoTen = hoTen;
	        this.ngaySinh = ngaySinh;
	        this.diemTrungBinh = diemTrungBinh;
	        this.lop = lop;
	    }

	    // Phương thức cho biết tên khoa mà sinh viên đang theo học
	    public String layTenKhoa() {
	        return lop.layTenKhoa();
	    }

	    // Phương thức kiểm tra sinh viên có đủ điều kiện tốt ngiệp không (điểm trung bình >=5.0)
	    public boolean kiemTraDuDieuKienTotNghiep() {
	        return diemTrungBinh >= 5.0;
	    }
	}
