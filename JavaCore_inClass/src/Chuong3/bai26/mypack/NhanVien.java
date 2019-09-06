package Chuong3.bai26.mypack;

import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private int soSp;
    static Scanner input = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String maNV, int soSp) {
        this.maNV = maNV;
        this.soSp = soSp;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSp() {
        return soSp;
    }

    public void setSoSp(int soSp) {
        if(soSp>0)
            this.soSp = soSp;
        else
            this.soSp = 0;
    }

    public void nhap(){
        System.out.print("Ma nhan vien: ");
        maNV = input.nextLine();
        System.out.print("So san pham: ");
        soSp = input.nextInt();
        input.nextLine();
    }

    public boolean coVuotChuan(){
        if(soSp>500)
            return true;
        else
            return false;
    }

    public String toString(){
        return maNV + " " + soSp;
    }

    public String getTongKet(){
        if(coVuotChuan())
            return "Vuot";
        else
            return " ";
    }

    public long getLuong(){
        if(coVuotChuan())
            return (500*20000+(soSp-500)*30000);
        else
            return soSp*20000;
    }

    public static void xuatTieuDe(){
        System.out.printf("%20s%20s%20s%20s%n",
                "Ma Nhan Vien", "So San Pham", "Luong", "Tong Ket");
    }

    public void inDuLieu(){
        System.out.printf("%20s%20d%20d%20s%n", maNV, soSp, getLuong(), getTongKet());
    }
}
