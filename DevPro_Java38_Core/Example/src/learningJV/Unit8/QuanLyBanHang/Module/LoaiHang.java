package learningJV.Unit8.QuanLyBanHang.Module;

import java.util.ArrayList;

public class LoaiHang {
    private String id;
    private String tenLoaiHang;
    private ArrayList<Hang> hangs = new ArrayList<Hang>();

    public LoaiHang() {
    }

    public LoaiHang(String id, String tenLoaiHang, ArrayList<Hang> hangs) {
        this.id = id;
        this.tenLoaiHang = tenLoaiHang;
        this.hangs = hangs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Hang> getHangs() {
        return hangs;
    }

    public void setHangs(ArrayList<Hang> hangs) {
        this.hangs = hangs;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }
}
