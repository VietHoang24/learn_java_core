package VuVanHung_Day1.Bai6;

import java.util.Scanner;

public class HocSinh {
    private String hoTen;
    private int ngay, thang, nam;
    private String gioiTinh;
    private float diemTrungBinh;
    private String xepLoai;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Ngay sinh: ");
        ngay = input.nextInt();
        System.out.print("Thang sinh: ");
        thang = input.nextInt();
        System.out.print("Nam sinh: ");
        nam = input.nextInt();
        input.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh = input.nextLine();
        System.out.print("Diem trung binh: ");
        diemTrungBinh = input.nextFloat();
        input.nextLine();
        System.out.print("Xep loai dao duc: ");
        xepLoai = input.nextLine();
    }

    public void xuat(){
        System.out.printf("%20s%15s%15s%15s%20s%20s%20s%n", "Ho Ten",
                "Ngay", "Thang", "Nam", "Gioi Tinh", "Diem TB", "Xep Loai");
        System.out.printf("%20s%15d%15d%15d%20s%20.2f%20s%n", hoTen,
                ngay, thang, nam, gioiTinh, diemTrungBinh, xepLoai);
    }
}
