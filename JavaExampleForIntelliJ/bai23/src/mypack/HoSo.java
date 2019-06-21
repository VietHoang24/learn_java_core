package mypack;

public class HoSo {
    private static int soNguoi;
    private String hoTen;

    public HoSo(String ht) {
        hoTen = ht;
        soNguoi++;
    }

    public static void tongKet() {
        System.out.println("Ho khau nay co " + soNguoi + " nguoi");
    }

    public void xuatHoTen() {
        System.out.println(hoTen);
    }
}
