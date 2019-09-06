package learningJV.Unit7.bai2;

public class HangDienTu extends SanPham {
    private double congSuat;
    private String dongDien;

    public HangDienTu() {
    }

    public HangDienTu(String maSanPham, String tenSanPham, String ngaySanXuat, double trongLuong, String mauSac, double congSuat, String dongDien) {
        super(maSanPham, tenSanPham, ngaySanXuat, trongLuong, mauSac);
        this.congSuat = congSuat;
        this.dongDien = dongDien;
    }

    @Override
    public String toString() {
        return "HangDienTu{" +
                "congSuat=" + congSuat +
                ", dongDien='" + dongDien + '\'' +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", ngaySanXuat='" + ngaySanXuat + '\'' +
                ", trongLuong=" + trongLuong +
                ", mauSac='" + mauSac + '\'' +
                '}';
    }
}
