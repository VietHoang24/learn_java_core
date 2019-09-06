package learningJV.Unit8.ArrayList;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private String gioiTinh;
    private String tenKhoaHoc;

    public SinhVien(int maSV, String hoTen, String gioiTinh, String tenKhoaHoc) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", tenKhoaHoc='" + tenKhoaHoc + '\'' +
                '}';
    }
}
