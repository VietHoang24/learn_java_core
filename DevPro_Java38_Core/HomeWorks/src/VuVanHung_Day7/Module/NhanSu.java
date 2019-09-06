package VuVanHung_Day7.Module;

import java.util.Scanner;

public class NhanSu {
    protected int maNhanSu;
    protected String hoDem;
    protected String ten;
    protected int namSinh;
    protected String gioiTinh;
    static Scanner input = new Scanner(System.in);

    public NhanSu() {
    }

    public NhanSu(int maNhanSu, String hoDem, String ten, int namSinh, String gioiTinh) {
        this.maNhanSu = maNhanSu;
        this.hoDem = hoDem;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public int getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(int maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void input(){
        System.out.print("Ma nhan su: ");
        maNhanSu = input.nextInt();
        input.nextLine();

        System.out.print("Ho dem: ");
        hoDem = input.nextLine();

        System.out.print("Ten: ");
        ten = input.nextLine();

        System.out.print("Nam sinh: ");
        namSinh = input.nextInt();
        input.nextLine();

        System.out.print("Gioi tinh: ");
        gioiTinh = input.nextLine();
    }

    public static void tieuDe(){
        System.out.printf("%15s%15s%12s%15s", "Ma NS", "Ho Ten", "Nam Sinh", "Gioi Tinh");
    }

    public void output(){
        System.out.printf("%15d%15s%12d%15s", maNhanSu, hoDem + " " + ten, namSinh, gioiTinh);
    }
}
