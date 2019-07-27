package Chuong3.bai36.Module;

public class GiaoDichNha extends GiaoDichDat {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String maGiaoDich, Date ngayGiaoDich, double donGia, String loaiDat, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, loaiDat, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
