import mypack.*;
public class Main {
    public static void main(String[] args){
        SinhVien sv1 = new SinhVien();
        System.out.println("Nhap thong tin sinh vien thu nhat.");
        sv1.nhapDuLieu();

        SinhVien sv2 = new SinhVien(1, "Vu Van Hung", 9.8f, 9.9f);
        System.out.println("Sinh vien thu 2. DONE!");

        SinhVien sv3 = new SinhVien();
        sv3.setMaSV(2);
        sv3.getMaSV();
        sv3.setHoTen("Vu Thi Hung");
        sv3.getHoTen();
        sv3.setDiemLT(8);
        sv3.getDiemLT();
        sv3.setDiemTH(9);
        sv3.getDiemTH();
        System.out.println("Sinh vien thu 3. DONE!");


        System.out.println("\t\t\t\tThong tin cac sinh vien");
        SinhVien.inTieuDe();
        sv1.inDuLieu();
        sv2.inDuLieu();
        sv3.inDuLieu();

        //phan mo rong
        System.out.println("- Nhap danh sach sinh vien");
        List a = new List();
        a.nhap();
        System.out.println("\n\t\t\t\t\t\tDanh sach sinh vien");
        a.xuat();

        //danh sach sv co diemtb cao nhat
        System.out.println("\n\t\t\t\tDanh sach sinh vien co diem trung binh cao nhat");
        a.inSinhVienTBLN();
    }
}
