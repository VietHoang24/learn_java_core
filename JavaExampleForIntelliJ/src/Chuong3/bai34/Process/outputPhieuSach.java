package Chuong3.bai34.Process;

public class outputPhieuSach extends inputPhieuNhapSach {
    public static void xuatPhieu(){
        for(int i=0; i<listPhieu.size(); i++){
            System.out.printf("%n%40s%n", "PHIEU NHAP SACH");
            System.out.print("\t\tMa phieu: " + listPhieu.get(i).getMaPhieu());
            System.out.println("\tNgay lap: " + listDate.get(i).getNgay() + "/"
                    + listDate.get(i).getThang() + "/"
                    + listDate.get(i).getNam());
            System.out.println("\t\tTong so luong nhap ve: " + outputChiTietSach.tong(i));
            System.out.println("\t\tChi tiet:");
            outputChiTietSach.tieuDe();
            outputChiTietSach.xuat(i);
        }
    }
}
