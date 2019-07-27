package Chuong3.bai37.Module;

public class NuocNgoai extends KhachHang {
    private String quocTich;

    public NuocNgoai() {
    }

    public NuocNgoai(String maKH, String hoTen, Date ngayRaHD, float soLuong, int donGia, String quocTich) {
        super(maKH, hoTen, ngayRaHD, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
}
