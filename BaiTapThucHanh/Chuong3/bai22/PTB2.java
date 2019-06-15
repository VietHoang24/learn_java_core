public class PTB2 {
    public static void main(String[] args) {
        classPTB2 a = new classPTB2();
        System.out.println("Nhap he so phuong trinh");
        a.nhap();
        System.out.print("PTB2: ");
        a.inTieuDe();
        a.inKetQua();

        System.out.println("- Nhap danh sach phuong trinh bac hai");
        classList b = new classList();
        b.nhap();
        System.out.println("- Danh sach cac phuong trinh vua nhap");
        b.xuat();
    }
}