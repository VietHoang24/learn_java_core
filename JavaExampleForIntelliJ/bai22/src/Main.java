import mypack.*;

public class Main {
    public static void main(String[] args) {
        PhuongTrinhBac2 a = new PhuongTrinhBac2();
        System.out.println("Nhap he so phuong trinh");
        a.nhap();
        System.out.print("PTB2: ");
        a.inTieuDe();
        a.inKetQua();

        System.out.println("- Nhap danh sach phuong trinh bac hai");
        List b = new List();
        b.nhap();
        System.out.println("- Danh sach cac phuong trinh vua nhap");
        b.xuat();
    }
}
