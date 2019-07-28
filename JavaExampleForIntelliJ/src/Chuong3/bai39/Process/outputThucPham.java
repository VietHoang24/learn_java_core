package Chuong3.bai39.Process;

public class outputThucPham extends inputHangThucPham {
    public static void tieuDe(){
        System.out.printf("%15s%15s%15s%15s%15s%15s%n",
                "Ma Hang", "Ten Hang", "Ton Kho", "Don Gia", "NSX", "HSD");
    }

    public static void xuatDSThucPham(){
        System.out.println("\n\t\t\t\t\t---> Xuat danh sach thuc pham <---");
        tieuDe();
        for (int i=0; i<listThucPham.size(); i++){
            System.out.printf("%15s%15s%15d%15.1f%15s%15s%n",
                    listThucPham.get(i).getMaHang(),
                    listThucPham.get(i).getTenHang(),
                    listThucPham.get(i).getSoLuongTonKho(),
                    listThucPham.get(i).getDonGia(),
                    listThucPham.get(i).getNsx().toString(),
                    listThucPham.get(i).getHsd().toString());
        }
    }
}
