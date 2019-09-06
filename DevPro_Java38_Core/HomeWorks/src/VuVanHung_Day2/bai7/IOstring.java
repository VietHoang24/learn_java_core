package VuVanHung_Day2.bai7;

import java.util.Scanner;

public class IOstring {
    private String s;

    public String getS() { return s; }

    public void setS(String s) { this.s = s; }

    public static IOstring nhap(){
        IOstring io = new IOstring();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String a = input.nextLine();
        io.setS(a);
        return io;
    }

    public static IOstring xuat(IOstring s){
        System.out.println("Hien thi chuoi: " + s.getS());
        return s;
    }

    public static void main(String[] args) {
        IOstring io = new IOstring();
        io = nhap();
        xuat(io);
    }
}
