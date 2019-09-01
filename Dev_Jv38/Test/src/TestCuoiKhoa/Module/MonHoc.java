package TestCuoiKhoa.Module;

public class MonHoc {
    private String maMonHoc;
    private String tenMonHoc;
    private int heSo;

    public MonHoc() {
    }

    public MonHoc(String maMonHoc, String tenMonHoc, int heSo) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.heSo = heSo;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
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
