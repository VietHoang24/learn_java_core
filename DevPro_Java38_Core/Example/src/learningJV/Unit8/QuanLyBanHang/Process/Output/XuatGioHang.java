package learningJV.Unit8.QuanLyBanHang.Process.Output;

import learningJV.Unit8.QuanLyBanHang.Process.Input.NhapKhachHang;

public class XuatGioHang extends NhapKhachHang {
    public static void xuatGioHang(int i){
        for (int j=0; j<khachHangs.get(i).getGioHangs().size(); j++){
            System.out.println("\t- Gio hang: (ID = " + khachHangs.get(i).getGioHangs().get(j).getId());
            XuatLoaiHang.xuatLoaiHang(i, j);
        }
    }
}
