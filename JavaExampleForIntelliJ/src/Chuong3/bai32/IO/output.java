package Chuong3.bai32.IO;

public class output extends input {
    public static void outputDate(){
        System.out.print(listKH.get(0).getNgayBan().getNgay() + "/" +
                listKH.get(0).getNgayBan().getThang() + "/" +
                listKH.get(0).getNgayBan().getNam());
    }

    public static void outputKH(){
        System.out.printf("%n%30s%s%25s", "Ma hoa don: ", listKH.get(0).getMaHD(), "Ngay ban: ");
        outputDate();
        System.out.printf("%n%30s%s%21s%s%n%n", "Khach hang: ", listKH.get(0).getTenKH(), "Dia chi: ", listKH.get(0).getDiaChi());
    }

    public static void tieuDe(){
        System.out.printf("%20s%20s%20s%20s%n", "Ten Hang", "Don Gia", "So Luong", "Thanh Tien");
    }

    public static void outputHoaDon(){
        System.out.printf("%n%50s%n", "HOA DON MUA HANG");
        outputKH();
        tieuDe();
        long tongSoLuong = 0, tongThanhTien = 0;
        for (int i=0; i<list.size(); i++) {
            System.out.printf("%20s%20d%20d%20d%n", list.get(i).getTenHang(),
                    list.get(i).getDonGia(), list.get(i).getSoLuong(), list.get(i).getThanhTien());
            tongSoLuong += list.get(i).getSoLuong();
            tongThanhTien += list.get(i).getThanhTien();
        }
        System.out.printf("%n%20s%40d%20d%n", "Tong tien", tongSoLuong, tongThanhTien);
    }
}
