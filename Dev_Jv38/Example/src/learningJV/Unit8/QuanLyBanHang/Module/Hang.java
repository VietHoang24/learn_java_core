package learningJV.Unit8.QuanLyBanHang.Module;

public class Hang {
    private String id;
    private String loaiHang;
    private LoaiHang loaiHangID;
    private String tenHang;
    private int soLuong;
    private double donGia;

    public Hang() {
    }

    public Hang(String id, String loaiHang, LoaiHang loaiHangID, String tenHang, int soLuong, double donGia) {
        this.id = id;
        this.loaiHang = loaiHang;
        this.loaiHangID = loaiHangID;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public LoaiHang getLoaiHangID() {
        return loaiHangID;
    }

    public void setLoaiHangID(LoaiHang loaiHangID) {
        this.loaiHangID = loaiHangID;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
