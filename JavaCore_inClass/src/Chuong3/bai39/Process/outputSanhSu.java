package Chuong3.bai39.Process;

public class outputSanhSu extends inputHangSanhSu {
    public static void tieuDe(){
        System.out.printf("%15s%15s%15s%15s%15s%15s%15s%15s%15s%n",
                "Ma Hang", "Ten Hang", "Ton Kho", "Don Gia", "Hang SX", "Nha SX", "Dia Chi", "Nhap Kho", "Danh Gia");
    }

    public static void xuatDSSanhSu(){
        System.out.println("\n\t\t\t\t\t\t---> Xuat danh sach sanh su <---");
        tieuDe();
        for (int i=0; i<listSanhSu.size(); i++){
            System.out.printf("%15s%15s%15d%15.1f%15s%15s%15s%15s%n",
                    listSanhSu.get(i).getMaHang(),
                    listSanhSu.get(i).getTenHang(),
                    listSanhSu.get(i).getSoLuongTonKho(),
                    listSanhSu.get(i).getDonGia(),
                    listSanhSu.get(i).getHangSX(),
                    listSanhSu.get(i).getNhaSX(),
                    listSanhSu.get(i).getDiaChi(),
                    listSanhSu.get(i).getNgayNhapKho().toString(),
                    listSanhSu.get(i).danhGia());
        }
    }
}
