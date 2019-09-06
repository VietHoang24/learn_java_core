package learningJV.Unit3.BaiTap1.Menu;

import learningJV.Unit3.BaiTap1.BaiToan1.PTB2;
import learningJV.Unit3.BaiTap1.BaiToan2.XepLoaiHocTap;
import learningJV.Unit3.BaiTap1.BaiToan3.TinhLuong;
import learningJV.Unit3.BaiTap1.BaiToan4.Date;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void menu(){
        do{
            System.out.println("\n1. Giai phuong trinh bac hai.");
            System.out.println("2. Xep loai hoc tap.");
            System.out.println("3. Tinh luong thuong phat.");
            System.out.println("4. Tim ngay trong thang.");
            System.out.println("5. Thoat chuong trinh.\n");
            System.out.print("Nhap lua chon cua ban: ");
            int n = input.nextInt();
            input.nextLine();

            switch (n){
                case 1:
                    System.out.println("\n--- Giai phuong trinh bac 2 ---");
                    PTB2.nhap();
                    System.out.println("\n==> Giai phuong trinh:");
                    PTB2.giaiPT();
                    break;
                case 2:
                    System.out.println("\n--- Xac dinh xep loai hoc luc ---");
                    XepLoaiHocTap.nhap();
                    System.out.println("\n==> Thong tin xep loai hoc sinh:");
                    XepLoaiHocTap.xepLoai();
                    break;
                case 3:
                    System.out.println("\n--- Xep loai thuong phat luong co ban theo doanh so ---");
                    TinhLuong.nhap();
                    System.out.println("\n==> Thong tin luong:");
                    TinhLuong.xepLoaiThuongPhat();
                    break;
                case 4:
                    System.out.println("\n--- Tim ngay trong thang ---");
                    Date.nhap();
                    System.out.println("\n==> Thong tin ngay thang nam:");
                    Date.check();
                    break;
                case 5:
                    System.out.println("\nThoat chuong trinh !!!");
                    return;
                default:
                    System.out.print("\nLua chon khong ton tai!!! Moi nhap lai: ");
                    n = input.nextInt();
                    while (n<0 || n>5){
                        System.out.print("Lua chon khong ton tai. Moi nhap lai: ");
                        n = input.nextInt();
                    }
                    input.nextLine();
            }
        } while (true);
    }
}
