package VuVanHung_Day1.Bai4;

public class Main {
    public static void main(String[] args){
        System.out.println("- Tam giac 1");
        TamGiac a = new TamGiac(3, 4, 5);
        a.xuat();
        System.out.println("- Tam giac 2");
        TamGiac b = new TamGiac();
        b.nhap();
        b.xuat();
    }
}
