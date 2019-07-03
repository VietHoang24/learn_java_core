package Chuong3.bai27.mypack;

import java.util.Scanner;

public class TamGiac {
    private int ma, mb, mc;
    static Scanner input = new Scanner(System.in);

    public boolean check(){
        if(ma+mb>mc && ma+mc>mb && mb+mc>ma && ma>0 && mb>0 && mc>0)
            return true;
        else
            return false;
    }

    public void nhap(){
        do{
            System.out.print("mA = ");
            ma = input.nextInt();
            System.out.print("mB = ");
            mb = input.nextInt();
            System.out.print("mC = ");
            mc = input.nextInt();
            if(check())
                System.out.println("=> Keep continue!\n");
            else
                System.out.println("=> Stop, press again!\n");
        } while(check()==false);
    }

    public TamGiac() {
    }

    public TamGiac(int ma, int mb, int mc) {
        if(check()){
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        } else{
            this.ma = this.ma;
            this.mb = this.mb;
            this.mc = this.mc;
        }
    }

    public int getCanhA() {
        return ma;
    }

    public void setCanhA(int ma) {
        if(check())
            this.ma = ma;
        else
            this.ma = this.ma;
    }

    public int getCanhB() {
        return mb;
    }

    public void setCanhB(int mb) {
        if(check())
            this.mb = mb;
        else
            this.mb = this.mb;
    }

    public int getCanhC() {
        return mc;
    }

    public void setCanhC(int mc) {
        if(check())
            this.mc = mc;
        else
            this.mc = this.mc;
    }

    public int getChuVi(){
        return ma+mb+mc;
    }

    public double getDienTich(){
        double s = getChuVi()/2;
        return Math.sqrt(s*(s-ma)*(s-mb)*(s-mc));
    }
}
