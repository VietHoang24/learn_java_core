package mypack;

import java.util.Scanner;

public class CNhanVien {
    private String mHo, mTen;
    private int mSoSP;
    static Scanner input = new Scanner(System.in);

    public CNhanVien() {
    }

    public CNhanVien(String mHo, String mTen, int mSoSP) {
        this.mHo = mHo;
        this.mTen = mTen;
        if(mSoSP>=0)
            this.mSoSP = mSoSP;
        else
            this.mSoSP = 0;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        if(mSoSP>=0)
            this.mSoSP = mSoSP;
        else
            this.mSoSP = 0;
    }

    public double getLuong(){
        double kq = 0;
        if(1<=mSoSP && mSoSP<=199)
            kq = mSoSP*0.5;
        else{
            if(200<=mSoSP && mSoSP<=399)
                kq = mSoSP*0.55;
            else{
                if(400<=mSoSP && mSoSP<=599)
                    kq = mSoSP*0.6;
                else
                    kq = mSoSP*0.65;
            }
        }
        return kq;
    }

    public boolean soSanhNV(CNhanVien nv2){
        if(this.mSoSP>nv2.mSoSP)
            return true;
        else
            return false;
    }

    public void nhap(){
        System.out.print("Ho: ");
        mHo = input.nextLine();
        System.out.print("Ten: ");
        mTen = input.nextLine();
        System.out.print("So san pham: ");
        mSoSP = input.nextInt();
        input.nextLine();
    }

    public static void xuatTieuDe(){
        System.out.printf("%20s%20s%20s%20s%n", "Ho", "Ten", "So San Pham", "Luong");
    }

    public void xuat(){
        System.out.printf("%20s%20s%20d%20.2f%n", mHo, mTen, mSoSP, getLuong());
    }
}
