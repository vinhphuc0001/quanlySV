package N20DCVT038_OOP_TH3_03;

public class NgaySinh {
	private int ngay;
    private int thang;
    private int nam;

    public NgaySinh(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    // Getters
    public int layNgay() {
        return ngay;
    }

    public int layThang() {
        return thang;
    }

    public int layNam() {
        return nam;

}
}
