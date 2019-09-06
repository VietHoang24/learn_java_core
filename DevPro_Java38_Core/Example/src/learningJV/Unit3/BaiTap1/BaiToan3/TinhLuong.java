package learningJV.Unit3.BaiTap1.BaiToan3;

import java.util.Scanner;

public class TinhLuong {
    private static long doanhSo;
    private static long luongCung;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap luong co ban cua ban: ");
        luongCung = input.nextLong();
        System.out.print("Nhap doanh so cua ban: ");
        doanhSo = input.nextLong();
        input.nextLine();
    }

    public static void xepLoaiThuongPhat(){
        if(doanhSo<50000000){
            System.out.println("Doanh so cua ban nho hon 50000000, ban bi tru 10% luong.");
            System.out.println("Luong cua ban la: " + (luongCung-luongCung*0.1));
        } else {
            if(50000000<doanhSo && doanhSo<=100000000){
                System.out.println("Ban khong bi tru luong va cun khong duoc thuong.");
                System.out.println("Luong cua ban la: " + luongCung);
            } else {
                if(100000000<doanhSo && doanhSo<=150000000){
                    System.out.println("Ban khong bi tru luong va duoc thuong them 5% doanh so.");
                    System.out.println("Luong cua ban la: " + (luongCung+luongCung*0.05));
                } else {
                    System.out.println("Ban khong bi tru luong va duoc thuong them 10% doanh so.");
                    System.out.println("Luong cua ban la: " + (luongCung+luongCung*0.1));
                }
            }
        }
    }
}
