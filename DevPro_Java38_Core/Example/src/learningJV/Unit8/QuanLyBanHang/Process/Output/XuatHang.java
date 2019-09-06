package learningJV.Unit8.QuanLyBanHang.Process.Output;

import learningJV.Unit8.QuanLyBanHang.Process.Input.NhapKhachHang;

public class XuatHang extends NhapKhachHang {
    public static void tieuDe(){
        System.out.printf("%20s%20s%20s%20s%n", "ID", "Ten Hang", "So Luong", "Don Gia");
    }

    public static void xuatHang(int i, int j, int k){
        for (int l=0; l<khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().get(k).getHangs().size(); l++){
            System.out.printf("%20s%20s%20d%20.1f%n",
                    khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().get(k).getHangs().get(l).getId(),
                    khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().get(k).getHangs().get(l).getTenHang(),
                    khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().get(k).getHangs().get(l).getSoLuong(),
                    khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().get(k).getHangs().get(l).getDonGia());
        }
    }

    public static void hienThiDsHang(){
        tieuDe();
        for (int i=0; i<khachHangs.size(); i++){
            for (int j=0; j<khachHangs.get(i).getGioHangs().size(); j++){
                for (int k=0; k<khachHangs.get(i).getGioHangs().get(j).getLoaiHangs().size(); k++){
                    xuatHang(i, j, k);
                }
            }
        }
    }
}
