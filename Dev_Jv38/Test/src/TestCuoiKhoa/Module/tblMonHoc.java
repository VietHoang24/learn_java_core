package TestCuoiKhoa.Module;

public class tblMonHoc {
    private String maMonHoc;
    private String tenMonHoc;
    private int heSo;

    public tblMonHoc() {
    }

    public tblMonHoc(String maMonHoc, String tenMonHoc, int heSo) {
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
