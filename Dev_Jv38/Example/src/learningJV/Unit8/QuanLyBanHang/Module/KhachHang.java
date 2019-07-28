package learningJV.Unit8.QuanLyBanHang.Module;

public class KhachHang {
    private String id;
    private String tenKH;
    private LoaiHang loaihangID;

    public KhachHang() {
    }

    public KhachHang(String id, String tenKH, LoaiHang loaihangID) {
        this.id = id;
        this.tenKH = tenKH;
        this.loaihangID = loaihangID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public LoaiHang getLoaihangID() {
        return loaihangID;
    }

    public void setLoaihangID(LoaiHang loaihangID) {
        this.loaihangID = loaihangID;
    }
}
