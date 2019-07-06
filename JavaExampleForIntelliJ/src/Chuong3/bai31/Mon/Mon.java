package Chuong3.bai31.Mon;

import java.util.Scanner;

public class Mon {
    private String tenMon;
    private int soHocTrinh;
    private String hocKy;
    private float diemThi;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Ten mon hoc: ");
        tenMon = input.nextLine();
        System.out.print("So hoc trinh: ");
        soHocTrinh = input.nextInt();
        input.nextLine();
        System.out.print("Hoc ky: ");
        hocKy = input.nextLine();
        System.out.print("Diem thi: ");
        diemThi = input.nextFloat();
        input.nextLine();
    }

    public void xuat(){
        System.out.printf("%20s%20d%20s%20.2f%n", tenMon, soHocTrinh, hocKy, diemThi);
    }

    public float getDiemThi() {
        return diemThi;
    }
}
