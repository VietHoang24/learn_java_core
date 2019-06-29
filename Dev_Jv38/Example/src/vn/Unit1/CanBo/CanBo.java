package vn.devpro.CanBo;

import java.util.Scanner;

public class CanBo {
    private int maCanBo;
    private String hoTen;
    private String ngaySinh;
    private int soNgaylamViec;
    private int soGioLamViec;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Ma can bo: ");
        maCanBo = input.nextInt();
        input.nextLine();
        System.out.print("Ho va ten: ");
        hoTen = input.nextLine();
        System.out.print("Ngay sinh: ");
        ngaySinh = input.nextLine();
        System.out.print("So ngay lam viec: ");
        soNgaylamViec = input.nextInt();
        System.out.print("So gio lam viec: ");
        soGioLamViec = input.nextInt();
        input.nextLine();
    }

    public long luong(){
        return soNgaylamViec*350000 + soGioLamViec*450000;
    }

    public void xuat(){
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tThong tin can bo");
        System.out.printf("%20s%20s%20s%20s%20s%20s%n",
                "Ma can bo", "Ho ten", "Ngay sinh", "So ngay", "So gio", "Luong");
        System.out.printf("%20d%20s%20s%20d%20d%20d%n",
                maCanBo, hoTen, ngaySinh, soNgaylamViec, soGioLamViec, luong());
    }
}
