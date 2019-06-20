import mypack.PhuongTrinhBac1;

public class Main {
    public static void main(String[] args) {
        PhuongTrinhBac1 x = new PhuongTrinhBac1();
        x.nhap();
        System.out.println(x.a + "x + " + x.b + " = 0");
        double kq = x.giaiPhuongTrinh();
        System.out.println("=> x = " + kq);
    }
}
