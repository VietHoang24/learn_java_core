package mypack;

import java.util.Scanner;

public class SinhVien {
    public String maSV, hoTen;
    public float diemLT, diemTH, diemTB;
    static Scanner input = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public void nhap(){
        System.out.print("Ma sinh vien: ");
        maSV = input.nextLine();
        System.out.print("Ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Diem ly thuyet: ");
        diemLT = input.nextFloat();
        System.out.print("Diem thuc hanh: ");
        diemTH = input.nextFloat();
        input.nextLine();
        diemTB = (diemLT+diemTH)/2;
    }

    public String toString(){
        return  "\t * \t" + maSV + "\t - \t"
                + hoTen + "\t - \t"
                + diemLT + "\t - \t"
                + diemTH + "\t - \t"
                + diemTB + "\t - \t";
    }

    public String getPass(){
        if(diemTB>=5)
            return "Dau\n";
        else
            return "Rot\n";
    }
}
