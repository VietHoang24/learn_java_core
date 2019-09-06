package Chuong3.bai24.mypack;

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

    public int getMaSV() { return maSV; }

    public void setMaSV(int maSV) { this.maSV = maSV; }

    public String getHoTen() { return hoTen; }

    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public float getDiemLT() { return diemLT; }

    public void setDiemLT(float diemLT) { this.diemLT = diemLT; }

    public float getDiemTH() { return diemTH; }

    public void setDiemTH(float diemTH) { this.diemTH = diemTH; }

    public float getDiemTrungBinh(){ return (diemLT+diemTH)/2; }

    public static void inTieuDe(){
        System.out.printf("%20s%20s%20s%20s%20s%n", "MaSinhVien",
                "HoTen", "DiemLyThuyet", "DiemThucHanh", "DiemTrungBinh");
    }

    static Scanner input = new Scanner(System.in);
    public void nhapDuLieu(){
        System.out.print("Ma sinh vien: ");
        maSV = input.nextInt();
        input.nextLine();
        System.out.print("Ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Diem ly thuyet: ");
        diemLT = input.nextFloat();
        System.out.print("Diem thuc hanh: ");
        diemTH = input.nextFloat();
        input.nextLine();
    }

    public void inDuLieu(){
        System.out.printf("%20d%20s%20.2f%20.2f%20.2f%n",
                maSV, hoTen, diemLT, diemTH, (diemTH+diemLT)/2);
    }
}
