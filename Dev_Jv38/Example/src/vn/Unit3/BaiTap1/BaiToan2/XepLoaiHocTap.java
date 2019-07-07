package vn.Unit3.BaiTap1.BaiToan2;

import java.util.Scanner;

public class XepLoaiHocTap {
    private static float diem;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap diem cua hoc sinh: ");
        diem = input.nextFloat();
        input.nextLine();
    }

    public static void xepLoai(){
        if(diem<0 || diem>10) {
            System.out.println("Diem khong hop le.");
            return;
        } else {
            if(diem>=8)
                System.out.println("Hoc sinh xep loai gioi.");
            else if(7<=diem && diem<8)
                System.out.println("Hoc sinh xep loai kha.");
            else if(5<=diem && diem<7)
                System.out.println("Hoc sinh xep loai trung binh.");
            else
                System.out.println("Hoc sinh xep loai yeu.");
        }
    }
}
