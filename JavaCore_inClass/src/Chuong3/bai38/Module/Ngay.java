package Chuong3.bai38.Module;

public class Ngay extends HoaDon {
    private double soNgayThue;

    public Ngay() {
    }

    public Ngay(String maHD, Date ngayHD, String tenKH, String maPhong, double donGia, double soNgayThue) {
        super(maHD, ngayHD, tenKH, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }

    public double getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(double soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
}
