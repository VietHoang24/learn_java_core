package Chuong3.bai37.Process;

public class ThanhTien extends inputKhachHang {
    public static double getThanhTienKhachHangVN(int i){
        double thanhTien = listVN.get(i).getSoLuong() * listVN.get(i).getDonGia();
        if (listVN.get(i).getSoLuong() <= listVN.get(i).getDinhMuc())
            return thanhTien;
        else
            return thanhTien * listVN.get(i).getDinhMuc()
                    + (listVN.get(i).getSoLuong()-listVN.get(i).getDinhMuc())
                    * listVN.get(i).getDonGia() * 2.5;
    }

    public static double getThanhTienKhachHangForeign(int i){
        double thanhTien = listForeign.get(i).getSoLuong() * listForeign.get(i).getDonGia();
        return thanhTien;
    }

    public static double thanhTienForeign(){
        double kq = 0;
        for (int i=0; i<listForeign.size(); i++){
            kq += getThanhTienKhachHangForeign(i);
        }
        return kq/listForeign.size();
    }
}
