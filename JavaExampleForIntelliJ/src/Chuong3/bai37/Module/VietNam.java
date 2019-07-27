package Chuong3.bai37.Module;

public class VietNam extends KhachHang {
    private String doiTuongKH;
    private int dinhMuc;

    public VietNam() {
    }

    public VietNam(String maKH, String hoTen, Date ngayRaHD, float soLuong, int donGia, String doiTuongKH, int dinhMuc) {
        super(maKH, hoTen, ngayRaHD, soLuong, donGia);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
}
