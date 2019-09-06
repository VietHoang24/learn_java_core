package learningJV.Unit8.QuanLyBanHang.Process.Output;

import learningJV.Unit8.QuanLyBanHang.Process.Input.NhapKhachHang;

public class XuatLoaiHang extends NhapKhachHang {
    public static void xuatLoaiHang(int i, int j){
        for (int k=0; k<khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().size(); k++){
            System.out.println("\t- ID loai hang: " +
                    khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().get(k).getId());
            System.out.println("\t- Ten loai hang: " +
                    khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().get(k).getTenLoaiHang());
            XuatHang.tieuDe();
            XuatHang.xuatHang(i, j, k);
        }
    }

    public static void hienThiLoaiHang(){
        System.out.printf("%20s%20s%n", "ID", "Ten Loai Hang");
        for (int i=0; i<khachHangs.size(); i++){
            for (int j=0; j<khachHangs.get(i).getGioHangs().size(); j++){
                for (int k=0; k<khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().size(); k++){
                    System.out.printf("%20s%20s%n",
                            khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().get(k).getId(),
                            khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().get(k).getTenLoaiHang());
                }
            }
        }
    }
}
