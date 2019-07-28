package Chuong3.bai39.Process;

public class outputDienMay extends inputHangDienMay {
    public static void tieuDe(){
        System.out.printf("%15s%15s%15s%15s%15s%15s%n",
                "Ma Hang", "Ten Hang", "Ton Kho", "Don Gia", "Bao Hanh", "Cong Suat");
    }

    public static void xuatDSDienMay(){
        System.out.println("\n\t\t\t\t\t\t---> Xuat danh sach dien may <---");
        tieuDe();
        for (int i=0; i<listDienMay.size(); i++){
            System.out.printf("%15s%15s%15d%15.1f%15d%15.1f%n",
                    listDienMay.get(i).getMaHang(),
                    listDienMay.get(i).getTenHang(),
                    listDienMay.get(i).getSoLuongTonKho(),
                    listDienMay.get(i).getDonGia(),
                    listDienMay.get(i).getThoiGianBaoHanh(),
                    listDienMay.get(i).getCongSuat());
        }
    }
}
