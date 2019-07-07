package vn.Unit3.BaiTap3.Menu;

import vn.Unit3.BaiTap3.BaiToan1.GiaiThua;
import vn.Unit3.BaiTap3.BaiToan2.SoDaoNguoc;
import vn.Unit3.BaiTap3.BaiToan3.SaiSo;
import vn.Unit3.BaiTap3.BaiToan4.PhanSoToiGian;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static void choice(){
        do{
            System.out.println("\n1. Tinh giai thua.");
            System.out.println("2. Tim so dao nguoc.");
            System.out.println("3. Tinh sai so.");
            System.out.println("4. Tim phan so toi gian.");
            System.out.println("5. Thoat.\n");
            System.out.print("Nhap lua chon cua ban: ");
            int n = input.nextInt();
            while (n<0 || n>5){
                System.out.print("Lua chon khong ton tai, moi nhap lai: ");
                n = input.nextInt();
            }

            switch (n){
                case 1:
                    System.out.println("\n--- Giai thua ---");
                    GiaiThua.nhap();
                    System.out.println("\n==> Tinh giai thua:");
                    GiaiThua.xuat();
                    break;
                case 2:
                    System.out.println("\n--- So Dao Nguoc ---");
                    SoDaoNguoc.nhap();
                    System.out.println("\n==> Tim so dao nguoc:");
                    SoDaoNguoc.xuat();
                    break;
                case 3:
                    System.out.println("\n--- Sai so ---");
                    SaiSo.nhap();
                    System.out.println("\n==> Tinh sai so:");
                    SaiSo.tinhSaiSo();
                    break;
                case 4:
                    System.out.println("\n--- Phan so toi gian ---");
                    PhanSoToiGian.nhap();
                    System.out.println("\n==> Toi gian phan so:");
                    PhanSoToiGian.xuat();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!!!");
                    return;
            }
        } while (true);
    }
}
