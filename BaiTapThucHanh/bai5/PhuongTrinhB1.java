import mypack.NhapPhuongTrinh;

public class PhuongTrinhB1 {
    public static void main(String[] args) {
        NhapPhuongTrinh x = new NhapPhuongTrinh();
        x.nhap();
        System.out.println(x.a + "x + " + x.b + " = 0");
        double kq = x.giaiPhuongTrinh();
        System.out.println("=> x = " + kq);
    }
}