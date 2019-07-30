package learningJV.Unit8.QuanLyBanHang.Module;

import java.util.ArrayList;

public class GioHang {
    private String id;
    private ArrayList<LoaiHang> loaiHangs = new ArrayList<LoaiHang>();

    public GioHang() {
    }

    public GioHang(String id, ArrayList<LoaiHang> loaiHangs) {
        this.id = id;
        this.loaiHangs = loaiHangs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<LoaiHang> getLoaiHangs() {
        return loaiHangs;
    }

    public void setLoaiHangs(ArrayList<LoaiHang> loaiHangs) {
        this.loaiHangs = loaiHangs;
    }
}
