import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT, diemTH;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public static void inTieuDe(){
        System.out.printf("20%s20%s20%s20s%20%sn", "MaSinhVien",
                "HoTen", "DiemLyThuyet", "DiemThucHanh", "DiemTrungBinh");
    }

    public void inDuLieu(){
        System.out.printf("20%d20%s20%f20f20%f%n", maSV, hoTen, diemLT, diemTH, (diemTH+diemLT)/2);
    }
}
