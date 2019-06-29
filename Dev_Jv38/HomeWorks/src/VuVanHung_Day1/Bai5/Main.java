package VuVanHung_Day1.Bai5;

public class Main {
    public static void main(String[] args){
        System.out.println("- Hinh 1");
        HinhHopChuNhat a = new HinhHopChuNhat(5, 3, 4);
        a.xuat();
        System.out.println("- Hinh 2");
        HinhHopChuNhat b = new HinhHopChuNhat();
        b.nhap();
        b.xuat();
    }
}
