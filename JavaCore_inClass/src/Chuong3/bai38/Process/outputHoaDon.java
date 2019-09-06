package Chuong3.bai38.Process;

public class outputHoaDon extends inputHoaDon {
    public static void tieuDeTheoGio(){
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s%n", "Ma Hoa Don",
                "Ngay Hoa Don", "Ten Khach Hang", "Ma Phong", "Don Gia", "So Gio Thue", "Thanh Tien");
    }

    public static void tieuDeTheoNgay(){
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s%n", "Ma Hoa Don",
                "Ngay Hoa Don", "Ten Khach Hang", "Ma Phong", "Don Gia", "So Ngay Thue", "Thanh Tien");
    }

    public static void output1TargetTime(int i){
        System.out.printf("%20s%20s%20s%20s%20.1f%20.1f%20.1f%n",
                listTime.get(i).getMaHD(),
                listTime.get(i).getNgayHD().toString(),
                listTime.get(i).getTenKH(),
                listTime.get(i).getMaPhong(),
                listTime.get(i).getDonGia(),
                listTime.get(i).getSoGioThue(),
                ThanhTien.getThanhTienTime(i));
    }

    public static void xuatHDTheoGio(){
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t-> Xuat hoa don theo gio <-");
        tieuDeTheoGio();
        for (int i=0; i<listTime.size(); i++){
            output1TargetTime(i);
        }
    }

    public static void output1TargetDay(int i){
        System.out.printf("%20s%20s%20s%20s%20.1f%20.1f%20.1f%n",
                listDay.get(i).getMaHD(),
                listDay.get(i).getNgayHD().toString(),
                listDay.get(i).getTenKH(),
                listDay.get(i).getMaPhong(),
                listDay.get(i).getDonGia(),
                listDay.get(i).getSoNgayThue(),
                ThanhTien.getThanhTienDay(i));
    }

    public static void xuatHDTheoNgay(){
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t-> Xuat hoa don theo ngay <-");
        tieuDeTheoNgay();
        for (int i=0; i<listDay.size(); i++){
            output1TargetDay(i);
        }
    }

    public static void tongSoLuong(){
        int demGio = 0;
        for (int i=0; i<listTime.size(); i++){
            if(ThanhTien.getThanhTienTime(i)!=-1)
                demGio++;
        }
        System.out.println("\t- So luong hoa don thue theo gio la: " + demGio);

        int demNgay = 0;
        for (int i=0; i<listDay.size(); i++){
            if (ThanhTien.getThanhTienDay(i)!=-1)
                demNgay++;
        }
        System.out.println("\t- So luong hoa don thue theo ngay la: " + demNgay);
    }

    public static void xuatTBTT(){
        System.out.println("\t- Trung binh thanh tien cua hoa don thue phong trong thang 9 nam 2013 la: " +
                 + ThanhTien.getTongThanhTien());
    }
}
