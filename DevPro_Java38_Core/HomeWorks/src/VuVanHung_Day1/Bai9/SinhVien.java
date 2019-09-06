package VuVanHung_Day1.Bai9;

import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private String ngaySinh;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Ma sinh vien: ");
        maSV = input.nextInt();
        input.nextLine();
        System.out.print("Ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Ngay sinh: ");
        ngaySinh = input.nextLine();
    }

    public void xuat(){
        System.out.println("\t\tMa sinh vien: " + maSV);
        System.out.println("\t\tHo ten: " + hoTen);
        System.out.println("\t\tNgay sinh: " + ngaySinh);
    }
}
