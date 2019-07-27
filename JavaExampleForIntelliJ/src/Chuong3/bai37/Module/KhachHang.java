package Chuong3.bai37.Module;

public class KhachHang {
    private String maKH;
    private String hoTen;
    private Date ngayRaHD;
    private double soLuong;
    private int donGia;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, Date ngayRaHD, float soLuong, int donGia) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayRaHD = ngayRaHD;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayRaHD() {
        return ngayRaHD;
    }

    public void setNgayRaHD(Date ngayRaHD) {
        this.ngayRaHD = ngayRaHD;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
}
