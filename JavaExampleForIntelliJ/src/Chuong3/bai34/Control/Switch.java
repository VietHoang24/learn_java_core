package Chuong3.bai34.Control;

import Chuong3.bai34.Process.*;

public class Switch {
    public static void choose(int n){
        switch (n){
            case 1:
                System.err.println("-> NHAP PHIEU <-");
                inputPhieuNhapSach.nhapDS();
                break;
            case 2:
                System.err.println("-> XUAT PHIEU <-");
                outputPhieuSach.xuatPhieu();
                break;
            case 3:
                System.err.println("-> THOAT CHUONG TRINH <-");
                System.exit(0);
        }
    }
}
