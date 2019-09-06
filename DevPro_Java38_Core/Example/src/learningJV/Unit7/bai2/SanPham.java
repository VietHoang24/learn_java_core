package learningJV.Unit7.bai2;

public class SanPham {
    protected String maSanPham;
    protected String tenSanPham;
    protected String ngaySanXuat;
    protected double trongLuong;
    protected String mauSac;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String ngaySanXuat, double trongLuong, String mauSac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.ngaySanXuat = ngaySanXuat;
        this.trongLuong = trongLuong;
        this.mauSac = mauSac;
    }

    public double getTrongLuong() {
        return trongLuong;
    }
}
