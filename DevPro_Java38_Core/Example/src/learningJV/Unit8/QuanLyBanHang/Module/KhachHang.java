package learningJV.Unit8.QuanLyBanHang.Module;

import java.util.ArrayList;

public class KhachHang {
    private String id;
    private String tenKH;
    private ArrayList<GioHang> gioHangs = new ArrayList<GioHang>();

    public KhachHang() {
    }

    public KhachHang(String id, String tenKH, ArrayList<GioHang> gioHangs) {
        this.id = id;
        this.tenKH = tenKH;
        this.gioHangs = gioHangs;
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

    public ArrayList<GioHang> getGioHangs() {
        return gioHangs;
    }

    public void setGioHangs(ArrayList<GioHang> gioHangs) {
        this.gioHangs = gioHangs;
    }
}
