package Chuong3.bai36.Process;

public class ThanhTien extends inputGiaoDich {
    public static double getTienDat(int i){
        double thanhTien = listNha.get(i).getDienTich() * listNha.get(i).getDonGia();
        if (listNha.get(i).getLoaiDat().compareToIgnoreCase("A")==0){
            return thanhTien * 1.5;
        } else {
            return thanhTien;
        }
    }

    public static double getTienNha(int i){
        double thanhTien = listNha.get(i).getDienTich() * listNha.get(i).getDonGia();
        if (listNha.get(i).getLoaiNha().compareToIgnoreCase("thuong")==0){
            return thanhTien * 0.9;
        } else {
            return thanhTien;
        }
    }
}
