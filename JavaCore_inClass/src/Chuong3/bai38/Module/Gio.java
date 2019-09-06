package Chuong3.bai38.Module;

public class Gio extends HoaDon {
    private double soGioThue;

    public Gio() {
    }

    public Gio(String maHD, Date ngayHD, String tenKH, String maPhong, double donGia, double soGioThue) {
        super(maHD, ngayHD, tenKH, maPhong, donGia);
        this.soGioThue = soGioThue;
    }

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }
}
