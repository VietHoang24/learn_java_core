package Module;

public class MonHoc extends Diem {
    private String tenMonHoc;
    private int heSo;

    public MonHoc() {
    }

    public MonHoc(String maMonHoc, float diemSo, String tenMonHoc, int heSo) {
        super(maMonHoc, diemSo);
        this.tenMonHoc = tenMonHoc;
        this.heSo = heSo;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
}
