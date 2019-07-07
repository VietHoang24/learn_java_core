package Chuong3.bai32.IO;

import Chuong3.bai32.Module.*;

public class output {
    public static void outputDate(Date a){
        System.out.print(a.getNgay() + "/" + a.getThang() + "/" + a.getNam());
    }

    public static void outputKH(KhachHang a){
        System.out.printf("%n%30s%s%25s", "Ma hoat dong: ", a.getMaHD(), "Ngay ban: ");
        outputDate(a.getNgayBan());
        System.out.printf("%n%28s%s%21s%s%n%n", "Khach hang: ", a.getTenKH(), "Dia chi: ", a.getDiaChi());
    }

    public static void outputHangHoa(HangHoa a){
        System.out.printf("%20s%20d%20d%20d%n", a.getTenHang(), a.getDonGia(), a.getSoLuong(), a.getThanhTien());
    }

    public static void tieuDe(){
        System.out.printf("%20s%20s%20s%20s%n", "Ten Hang", "Don Gia", "So Luong", "Thanh Tien");
    }

    public static void outputHoaDon(HoaDon a){
        System.out.printf("%n%50s%n", "HOA DON MUA HANG");
        outputKH(a.getKhachHang());
        tieuDe();
        long tongSoLuong = 0, tongThanhTien = 0;
        for (int i=0; i<a.getHangHoa().size(); i++) {
            outputHangHoa(a.getHangHoa().get(i));
            tongSoLuong += a.getHangHoa().get(i).getSoLuong();
            tongThanhTien += a.getHangHoa().get(i).getThanhTien();
        }
        System.out.printf("%n%20s%40d%20d%n", "Tong tien", tongSoLuong, tongThanhTien);
    }
}
