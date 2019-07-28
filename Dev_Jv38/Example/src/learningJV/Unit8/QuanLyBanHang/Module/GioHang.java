package learningJV.Unit8.QuanLyBanHang.Module;

public class GioHang {
    private String id;
    private String tenHang;
    private LoaiHang loaiHangID;

    public GioHang() {
    }

    public GioHang(String id, String tenHang, LoaiHang loaiHangID) {
        this.id = id;
        this.tenHang = tenHang;
        this.loaiHangID = loaiHangID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public LoaiHang getLoaiHangID() {
        return loaiHangID;
    }

    public void setLoaiHangID(LoaiHang loaiHangID) {
        this.loaiHangID = loaiHangID;
    }
}
