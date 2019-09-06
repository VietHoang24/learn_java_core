package learningJV.Unit6.SinhVien.Module;

public class Subjects {
    private int maHocPhan;
    private String tenHocPhan;
    private int soTC;
    private double diem;

    public Subjects() {
    }

    public Subjects(int maHocPhan, String tenHocPhan, int soTC, double diem) {
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.soTC = soTC;
        this.diem = diem;
    }

    public int getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(int maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "\n\tSubjects{" +
                "maHocPhan='" + maHocPhan + '\'' +
                ", tenHocPhan='" + tenHocPhan + '\'' +
                ", soTC=" + soTC +
                ", diem=" + diem +
                '}';
    }
}
