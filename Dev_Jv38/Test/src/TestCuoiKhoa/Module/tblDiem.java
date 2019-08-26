package TestCuoiKhoa.Module;

public class tblDiem extends tblMonHoc {
    private float diemSo;

    public tblDiem() {
    }

    public tblDiem(String maMonHoc, String tenMonHoc, int heSo, float diemSo) {
        super(maMonHoc, tenMonHoc, heSo);
        this.diemSo = diemSo;
    }

    public float getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(float diemSo) {
        this.diemSo = diemSo;
    }
}
