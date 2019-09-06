package VuVanHung_Day1.Bai10;

public class Main {
    public static void main(String[] args){
        TachSo a = new TachSo();
        System.out.println("- Nhap so co 4 chu so");
        a.nhap();
        a.tachSo();
        System.out.print("Cac chu so cua n la: ");
        a.xuat();
        System.out.println("\nTong cac chu so cua n la: " + a.getTong());
    }
}
