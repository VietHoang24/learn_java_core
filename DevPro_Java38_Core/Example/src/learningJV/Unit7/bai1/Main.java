package learningJV.Unit7.bai1;

public class Main {
    public static void main(String[] args) {
        Diem A = new Diem(-2, 3);
        Diem B = new Diem(0, 1);
        Diem C = new Diem(6, 7);
        TamGiac tg = new TamGiac(A, B, C);
        System.out.println("Dien tich tam giac 1 la: " + tg.dienTich());

        TamGiac tg1 = new TamGiac(new Diem(-2, -3), new Diem(0, 0), new Diem(2, -5));
        System.out.println("Dien tich tam giac 2 la: " + tg1.dienTich());
    }
}
