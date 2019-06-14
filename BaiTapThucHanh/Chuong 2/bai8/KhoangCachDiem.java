import mypack.nhap;

public class KhoangCachDiem {
    public static void main(String[] args) {
        nhap a = new nhap();
        a.nhapDiem();
        System.out.println("Khoang cach giua hai diem la: " + a.khoangCach());
    }
}