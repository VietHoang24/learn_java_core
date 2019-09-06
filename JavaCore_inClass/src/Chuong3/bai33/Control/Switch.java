package Chuong3.bai33.Control;

import Chuong3.bai33.IO.*;

public class Switch {
    public static void luaChon(int n){
        switch (n){
            case 1:
                inputSinhVien.nhapDSSV();
                break;
            case 2:
                System.out.println("----------------------------------------------------");
                System.out.println("\t\t\t=> Danh sach sinh vien <=");
                System.out.println("--------------------------------------------------------------------------------------------------------");
                outputSinhVien.tieuDeSV();
                outputSinhVien.xuatDSSV();
                System.out.println("--------------------------------------------------------------------------------------------------------");
                break;
            case 3:
                System.out.println("----------------------------------------------------");
                System.out.println("\t\t\t=> Danh sach phieu sinh vien <=");
                System.out.println("--------------------------------------------------------------------------------------------------------");
                outputSinhVien.phieuBaoDiem();
                break;
            case 4:
                System.out.println("----------------------------------------------------");
                System.out.println("\n\t\t=> Thoat chuong trinh <=\n");
                System.out.println("----------------------------------------------------");
                System.exit(0);
        }
    }
}
