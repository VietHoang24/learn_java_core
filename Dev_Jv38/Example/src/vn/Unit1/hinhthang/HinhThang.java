package vn.devpro.hinhthang;

public class HinhThang {
    private double a, b, h;

    public HinhThang(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double dienTich(){
        return (a+b)*h/2;
    }

    public void xuat(){
        System.out.println("Dien tich la: " + dienTich());
    }
}
