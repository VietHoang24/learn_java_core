package learningJV.Unit7.bai3;

public class TiVi extends HangDienTu {
    private String nhanHieu;
    private double kichThuoc;

    public TiVi() {
    }

    public TiVi(String maHang, String tenHang, int soLuong, double giaTien, String hangSanXuat, double congSuat, String nhanHieu, double kichThuoc) {
        super(maHang, tenHang, soLuong, giaTien, hangSanXuat, congSuat);
        this.nhanHieu = nhanHieu;
        this.kichThuoc = kichThuoc;
    }

    @Override
    public String toString() {
        return "TiVi{" +
                "nhanHieu='" + nhanHieu + '\'' +
                ", kichThuoc=" + kichThuoc +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", congSuat=" + congSuat +
                ", maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", soLuong=" + soLuong +
                ", giaTien=" + giaTien +
                '}';
    }
}
