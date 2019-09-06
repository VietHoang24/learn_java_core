package VuVanHung_Day2.bai6;

import java.util.Scanner;

public class IOput {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static IOput nhap(){
        IOput io = new IOput();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri: ");
        int a = input.nextInt();
        io.setN(a);
        return io;
    }

    public static void xuat(IOput io){ System.out.println("Gia tri vua nhap: " + io.getN()); }

    public static void main(String[] args) {
        IOput io = new IOput();
        io = nhap();
        xuat(io);
    }
}
