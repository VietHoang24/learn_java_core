package Chuong3.bai38.Control;

import Chuong3.bai38.Process.*;

public class Switch {
    public static void chooce(int n){
        switch (n){
            case 1:
                System.out.println("\t\t---> Nhap danh sach hoa don theo gio <---");
                inputHoaDon.nhapDSHDTheoGio();
                break;
            case 2:
                System.out.println("\t\t---> Nhap danh sach hoa don theo ngay <---");
                inputHoaDon.nhapDSHDTheoNgay();
                break;
            case 3:
                System.out.println("\t\t\t\t\t\t\t\t---> Xuat danh sach hoa don <---");
                outputHoaDon.xuatHDTheoGio();
                outputHoaDon.xuatHDTheoNgay();
                break;
            case 4:
                System.out.println("\t\t---> Tong so luong cho tung loai thue phong <---");
                outputHoaDon.tongSoLuong();
                break;
            case 5:
                System.out.println("\t\t---> Trung binh thanh tien hoa don trong thang 9 nam 2013 <---");
                outputHoaDon.xuatTBTT();
                break;
            case 0:
                System.out.println("\t\t\t---> Thoat chuong trinh <---");
                System.exit(0);
        }
    }
}
