package TestCuoiKhoa.Module;

public class Diem extends MonHoc {
    private float diemSo;

    public Diem() {
    }

    public Diem(String maMonHoc, String tenMonHoc, int heSo, float diemSo) {
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
