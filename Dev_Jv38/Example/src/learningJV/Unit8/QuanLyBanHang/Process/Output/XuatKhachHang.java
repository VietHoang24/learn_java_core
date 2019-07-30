package learningJV.Unit8.QuanLyBanHang.Process.Output;

import learningJV.Unit8.QuanLyBanHang.Process.Input.NhapKhachHang;

public class XuatKhachHang extends NhapKhachHang {
    public static void xuatKhachHang(){
        for (int i=0; i<khachHangs.size(); i++){
            System.out.println("\t- ID khach hang: " + khachHangs.get(i).getId());
            System.out.println("\t- Ten khach hang: " + khachHangs.get(i).getTenKH());
            XuatGioHang.xuatGioHang(i);
        }
    }

    public static void hienThiKhachHang(){
        System.out.printf("%20s%20s%n", "ID", "Ten Khach Hang");
        for (int i=0; i<khachHangs.size(); i++){
            System.out.printf("%20s%20s%n",
                    khachHangs.get(i).getId(), khachHangs.get(i).getTenKH());
        }
    }
}
