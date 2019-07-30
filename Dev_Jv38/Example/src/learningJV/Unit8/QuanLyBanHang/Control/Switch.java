package learningJV.Unit8.QuanLyBanHang.Control;

import learningJV.Unit8.QuanLyBanHang.Process.Input.NhapKhachHang;
import learningJV.Unit8.QuanLyBanHang.Process.Output.*;

public class Switch {
    public static void chooce(int n){
        switch (n){
            case 1:
                NhapKhachHang.nhapDsKhachHang();
                break;
            case 2:
                XuatLoaiHang.hienThiLoaiHang();
                break;
            case 3:
                XuatHang.hienThiDsHang();
                break;
            case 4:
                XuatKhachHang.hienThiKhachHang();
                break;
            case 5:
                XuatKhachHang.xuatKhachHang();
                break;
            case 6:
                System.out.println("------- THOAT CHUONG TRINH -------");
                System.exit(0);
        }
    }
}
