package Chuong3.bai37.Control;

import Chuong3.bai37.Process.*;

public class Switch {
    public static void chooce(int n){
        switch (n){
            case 1:
                System.out.println("\t\t---> Nhap danh sach khach hang Viet Nam <---");
                inputKhachHang.nhapDSKHVN();
                break;
            case 2:
                System.out.println("\t\t---> Nhap danh sach khach hang nuoc ngoai <---");
                inputKhachHang.nhapDSKHForeign();
                break;
            case 3:
                System.out.println("\t\t\t\t\t\t\t\t---> Hoa don khach hang Viet Nam <---");
                outputKhachHang.xuatDSKHVN();
                System.out.println("\n\t\t\t\t\t\t\t\t---> Hoa don khach hang nuoc ngoai <---");
                outputKhachHang.xuatDSKHForeign();
                break;
            case 4:
                System.out.println("\t\t---> Tong so luong dien tieu thu khach hang <---");
                outputKhachHang.tongSoLuong();
                break;
            case 5:
                System.out.println("\t\t---> Trung binh thanh tien cua khach hang nuoc ngoai <---");
                outputKhachHang.xuatThanhTienForeign();
                break;
            case 6:
                System.out.println("\t\t\t\t\t\t\t\t\t---> Hoa don trong thang 9 nam 2013 <---");
                outputKhachHang.xuatHoaDon();
                break;
            case 0:
                System.out.println("\t\t---> Thoat chuong trinh <---");
                System.exit(0);
        }
    }
}
