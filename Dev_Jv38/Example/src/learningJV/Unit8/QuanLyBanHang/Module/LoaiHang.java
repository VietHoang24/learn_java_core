package learningJV.Unit8.QuanLyBanHang.Module;

public class LoaiHang {
    private String id;
    private String tenLoai;

    public LoaiHang() {
    }

    public LoaiHang(String id, String tenLoai) {
        this.id = id;
        this.tenLoai = tenLoai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
}
