package Module;

public class Diem {
    protected String maMonHoc;
    protected float diemSo;

    public Diem() {
    }

    public Diem(String maMonHoc, float diemSo) {
        this.maMonHoc = maMonHoc;
        this.diemSo = diemSo;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public float getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(float diemSo) {
        this.diemSo = diemSo;
    }
}
