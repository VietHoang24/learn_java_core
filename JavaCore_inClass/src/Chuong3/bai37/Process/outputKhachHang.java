package Chuong3.bai37.Process;

public class outputKhachHang extends inputKhachHang {
    public static void tieuDeVN(){
        System.out.printf("%15s%15s%15s%15s%15s%15s%15s%15s%n",
                "Ma KH", "Ho Ten", "Thoi Gian", "Doi Tuong",
                "So Luong", "Don Gia", "Dinh Muc", "Thanh Tien");
    }

    public static void tieuDeForeign(){
        System.out.printf("%15s%15s%15s%15s%15s%15s%15s%n",
                "Ma KH", "Ho Ten", "Thoi Gian", "Quoc Tich", "So Luong", "Don Gia", "Thanh Tien");
    }

    public static void output1TargetVN(int i){
        System.out.printf("%15s%15s%15s%15s%15.1f%15d%15d%15.1f%n",
                listVN.get(i).getMaKH(),
                listVN.get(i).getHoTen(),
                listVN.get(i).getNgayRaHD().toString(),
                listVN.get(i).getDoiTuongKH(),
                listVN.get(i).getSoLuong(),
                listVN.get(i).getDonGia(),
                listVN.get(i).getDinhMuc(),
                ThanhTien.getThanhTienKhachHangVN(i));
    }

    public static void xuatDSKHVN(){
        tieuDeVN();
        for (int i=0; i<listVN.size(); i++){
            output1TargetVN(i);
        }
    }

    public static void output1TargetForeign(int i){
        System.out.printf("%15s%15s%15s%15s%15.1f%15d%15.1f%n",
                listForeign.get(i).getMaKH(),
                listForeign.get(i).getHoTen(),
                listForeign.get(i).getNgayRaHD().toString(),
                listForeign.get(i).getQuocTich(),
                listForeign.get(i).getSoLuong(),
                listForeign.get(i).getDonGia(),
                ThanhTien.getThanhTienKhachHangForeign(i));
    }

    public static void xuatDSKHForeign(){
        tieuDeForeign();
        for (int i=0; i<listForeign.size(); i++){
            output1TargetForeign(i);
        }
    }

    public static void tongSoLuong(){
        double tongVN = 0;
        double tongForeign = 0;

        for (int i=0; i<listVN.size(); i++){
            tongVN += listVN.get(i).getSoLuong();
        }

        for (int i=0; i<listForeign.size(); i++){
            tongForeign += listForeign.get(i).getSoLuong();
        }

        System.out.println("\n\t- So luong dien tieu thu cua khach hang Viet Nam la: " + tongVN
                + " va khach hang nuoc ngoai la: " + tongForeign);
    }

    public static void xuatThanhTienForeign(){
        System.out.println("\t- Trung binh thanh tien cua khach hang nuoc ngoai: " + ThanhTien.thanhTienForeign());
    }

    public static void xuatHoaDon(){
        System.out.println("\n\t\t\t\t\t\t-> Khach hang Viet Nam <-");
        tieuDeVN();
        for (int i=0; i<listVN.size(); i++){
            if (listVN.get(i).getNgayRaHD().getThang()==9 &&
                listVN.get(i).getNgayRaHD().getNam()==2013){
                output1TargetVN(i);
            }
        }

        System.out.println("\n\t\t\t\t\t\t-> Khach hang nuoc ngoai <-");
        tieuDeForeign();
        for (int i=0; i<listForeign.size(); i++){
            if (listForeign.get(i).getNgayRaHD().getThang()==9 &&
                listForeign.get(i).getNgayRaHD().getNam()==2013){
                output1TargetForeign(i);
            }
        }
    }
}
