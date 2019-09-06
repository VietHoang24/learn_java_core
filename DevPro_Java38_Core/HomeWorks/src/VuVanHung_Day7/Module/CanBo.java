package VuVanHung_Day7.Module;

import java.util.Scanner;

public class CanBo extends NhanSu {
    private Phong phong;
    private String chucVu;
    private double heSoLuong;
    private String xepLoai;
    private double luong;
    static Scanner input = new Scanner(System.in);

    public CanBo() {
    }

    public CanBo(Phong phong, String chucVu, double heSoLuong, String xepLoai, double luong) {
        this.phong = phong;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.xepLoai = xepLoai;
        this.luong = luong;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public double getLuong() {
        return tinhLuong();
    }

    public void inputCB(){
        super.input();

        phong = new Phong();
        System.out.print("Ten phong: ");
        String tenPhong = input.nextLine();
        phong.setTenPhong(tenPhong);

        System.out.print("Truong phong: ");
        String truongPhong = input.nextLine();
        phong.setTruongPhong(truongPhong);

        System.out.print("Chuc vu: ");
        chucVu = input.nextLine();

        System.out.print("He so luong: ");
        heSoLuong = input.nextDouble();
        input.nextLine();

        System.out.print("Xep loai: ");
        xepLoai = input.nextLine();
    }

    public double tinhLuong(){
        if(xepLoai.compareTo("A")==0){
            luong = heSoLuong*1150000 + 1000000;
        } else {
            if (xepLoai.compareTo("B")==0){
                luong = heSoLuong*1150000 - 400000;
            } else {
                luong = heSoLuong*1150000 - 1000000;
            }
        }
        return luong;
    }

    public static void tieuDe(){
        System.out.printf("%15s%15s%10s%15s%10s%15s%n", "Ten Phong",
                "Truong Phong", "Chuc Vu", "He So Luong", "Xep Loai", "Luong");
    }

    public void outputCB(){
        super.output();
        System.out.printf("%15s%15s%10s%15.1f%10s%15.2f%n", phong.getTenPhong(),
                phong.getTruongPhong(), chucVu, heSoLuong, xepLoai, tinhLuong());
    }
}
